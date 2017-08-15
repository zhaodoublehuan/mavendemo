package com.zhh.service.impl;

import java.util.List;

import org.apache.log4j.Logger;
import org.quartz.CronScheduleBuilder;
import org.quartz.CronTrigger;
import org.quartz.JobBuilder;
import org.quartz.JobDetail;
import org.quartz.JobKey;
import org.quartz.Scheduler;
import org.quartz.SchedulerException;
import org.quartz.TriggerBuilder;
import org.quartz.TriggerKey;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.alibaba.fastjson.JSON;
import com.google.common.collect.Sets;
import com.zhh.entity.ScheduleJob;
import com.zhh.service.IJobManagerService;
import com.zhh.service.IScheduleJobService;
import com.zhh.util.QuartzJobFactory;

/**
* @ClassName: ScheduleJobService
* @Description: 定时任务实现类
* @author zhh
* @date 2016-8-5 上午10:57:54
* 
*/
@Service
public class JobManagerService implements InitializingBean, IJobManagerService {
	
	private final static Logger LOGGER =  Logger.getLogger(JobManagerService.class);
	/**
	 * @Fields scheduler : TODO(用一句话描述这个变量表示什么)
	 */
	private Scheduler scheduler;
	
	@Autowired
	private IScheduleJobService scheduleJobService;
	/**
	 * 项目启动时，会先运行该方法
	 */
	public void afterPropertiesSet() throws Exception {
		try{
			init();
		}catch (Exception e) {
			LOGGER.error("初始化定时任务失败===="+e.getMessage());
		}
	}
	
	/** 
	* @Title: init 
	* @Description: 初始化方法   项目启动的时候加载定时器
	* @param     设定文件 
	* @return void    返回类型 
	* @throws 
	*/ 
	
	public void init(){
		
		LOGGER.warn("初始化定时任务");
		ScheduleJob entity = new ScheduleJob();
		entity.setJobStatus("1");
		
		try {
			/*查询数据库中所有的任务*/
			List<ScheduleJob> jobList = scheduleJobService.queryAllScheduleJob(entity);
			LOGGER.warn("初始化定时任务列表===="+JSON.toJSONString(jobList));
			for (ScheduleJob scheduleJob : jobList) {
				TriggerKey triggerKey = TriggerKey.triggerKey(scheduleJob.getJobName(), scheduleJob.getJobGroup());
				// 获取trigger，即在spring配置文件中定义的 bean id="myTrigger"
				CronTrigger trigger;
				
				trigger = (CronTrigger) scheduler.getTrigger(triggerKey);
				// 不存在，创建一个
				if (null == trigger) {
					JobDetail jobDetail = JobBuilder.newJob(QuartzJobFactory.class).withIdentity(scheduleJob.getJobName(), scheduleJob.getJobGroup()).build();
					jobDetail.getJobDataMap().put("scheduleJob", scheduleJob);
					// 表达式调度构建器
					CronScheduleBuilder scheduleBuilder = CronScheduleBuilder.cronSchedule(scheduleJob.getCronExpression());
					// 按新的cronExpression表达式构建一个新的trigger
					trigger = TriggerBuilder.newTrigger().withIdentity(scheduleJob.getJobName(), scheduleJob.getJobGroup()).withSchedule(scheduleBuilder).build();
					scheduler.scheduleJob(jobDetail, trigger);
				} else {
					// Trigger已存在，那么更新相应的定时设置
					// 表达式调度构建器
					CronScheduleBuilder scheduleBuilder = CronScheduleBuilder.cronSchedule(scheduleJob.getCronExpression());
					// 按新的cronExpression表达式重新构建trigger
					trigger = trigger.getTriggerBuilder().withIdentity(triggerKey).withSchedule(scheduleBuilder).build();
					// 按新的trigger重新设置job执行
					scheduler.rescheduleJob(triggerKey, trigger);
				}
			}
		} catch (SchedulerException e) {
			e.printStackTrace();
		}
	} 
	
	/** 
	* @Title: addJob 
	* @Description: 添加定时任务
	* @param @param scheduleJob
	* @param @throws SchedulerException    设定文件 
	* @return void    返回类型 
	* @throws 
	*/ 
	public void addJob(ScheduleJob scheduleJob)  throws SchedulerException{
		LOGGER.warn("添加定时任务=====" + JSON.toJSONString(scheduleJob));
		try{
			TriggerKey triggerKey = TriggerKey.triggerKey(scheduleJob.getJobName(), scheduleJob.getJobGroup());
			// 获取trigger，即在spring配置文件中定义的 bean id="myTrigger"
			CronTrigger trigger = (CronTrigger) scheduler.getTrigger(triggerKey);
			// 不存在，创建一个
			if (null == trigger) {
				JobDetail jobDetail = JobBuilder.newJob(QuartzJobFactory.class).withIdentity(scheduleJob.getJobName(), scheduleJob.getJobGroup()).build();
				jobDetail.getJobDataMap().put("scheduleJob", scheduleJob);
				// 表达式调度构建器
				CronScheduleBuilder scheduleBuilder = CronScheduleBuilder.cronSchedule(scheduleJob.getCronExpression());
				// 按新的cronExpression表达式构建一个新的trigger
				trigger = TriggerBuilder.newTrigger().withIdentity(scheduleJob.getJobName(), scheduleJob.getJobGroup()).withSchedule(scheduleBuilder).build();
				scheduler.scheduleJob(jobDetail, trigger);
			}
		}catch (SchedulerException e) {
			LOGGER.error("添加定时任务失败===="+e.getMessage());
			throw e;
		}
	}
	
	/** 
	* @Title: rescheduleJob 
	* @Description: 修改定时任务
	* @param @param scheduleJob
	* @param @throws SchedulerException    设定文件 
	* @return void    返回类型 
	* @throws 
	*/ 
	
	public void rescheduleJob(ScheduleJob scheduleJob) throws SchedulerException {
		LOGGER.warn("修改定时任务=====" + JSON.toJSONString(scheduleJob));
		try{
			JobKey jobKey = new JobKey(scheduleJob.getJobName(), scheduleJob.getJobGroup());
			JobDetail jobDetail = scheduler.getJobDetail(jobKey);
			
			jobDetail.getJobDataMap().put("scheduleJob", scheduleJob);
			
			TriggerKey triggerKey = TriggerKey.triggerKey(scheduleJob.getJobName(), scheduleJob.getJobGroup());
			// 获取trigger，即在spring配置文件中定义的 bean id="myTrigger"
			CronTrigger trigger = (CronTrigger) scheduler.getTrigger(triggerKey);
			// 表达式调度构建器
			CronScheduleBuilder scheduleBuilder = CronScheduleBuilder.cronSchedule(scheduleJob.getCronExpression());
			// 按新的cronExpression表达式重新构建trigger
			trigger = trigger.getTriggerBuilder().withIdentity(triggerKey).withSchedule(scheduleBuilder).build();
			// 按新的trigger重新设置job执行
			scheduler.scheduleJob(jobDetail, Sets.newHashSet(trigger), true);
		}catch (SchedulerException e) {
			LOGGER.error("修改定时任务失败=="+e.getMessage());
			throw e;
		}
	}
	
	/** 
	* @Title: pauseJob 
	* @Description: 暂停定时任务
	* @param @param scheduleJob
	* @param @throws SchedulerException    设定文件 
	* @return void    返回类型 
	* @throws 
	*/ 
	
	public void pauseJob(ScheduleJob scheduleJob) throws SchedulerException {
		LOGGER.warn("暂停定时任务=====" + JSON.toJSONString(scheduleJob));
		try{
			JobKey jobKey = JobKey.jobKey(scheduleJob.getJobName(), scheduleJob.getJobGroup());
			scheduler.pauseJob(jobKey);
		}catch (SchedulerException e) {
			LOGGER.error("暂停定时任务失败===="+e.getMessage());
			throw e;
		}
	}
	
	/** 
	* @Title: resumeJob 
	* @Description: 恢复定时任务
	* @param @param scheduleJob
	* @param @throws SchedulerException    设定文件 
	* @return void    返回类型 
	* @throws 
	*/ 
	
	public void resumeJob(ScheduleJob scheduleJob) throws SchedulerException {
		LOGGER.warn("恢复定时任务=====" + JSON.toJSONString(scheduleJob));
		try{
			JobKey jobKey = JobKey.jobKey(scheduleJob.getJobName(), scheduleJob.getJobGroup());
			scheduler.resumeJob(jobKey);
		}catch (SchedulerException e) {
			LOGGER.error("恢复定时任务失败===="+e.getMessage());
			throw e;
		}
	}
	
	/** 
	* @Title: triggerJob 
	* @Description: 立即执行一次定时任务 
	* @param @param scheduleJob
	* @param @throws SchedulerException    设定文件 
	* @return void    返回类型 
	* @throws 
	*/ 
	
	public void triggerJob(ScheduleJob scheduleJob) throws SchedulerException {
		LOGGER.warn("立即执行定时任务=====" + JSON.toJSONString(scheduleJob));
		try{
			JobKey jobKey = JobKey.jobKey(scheduleJob.getJobName(), scheduleJob.getJobGroup());
			scheduler.triggerJob(jobKey);
		}catch (SchedulerException e) {
			LOGGER.error("立即执行定时任务失败====="+e.getMessage());
			throw e;
		}
	}
	
	/** 
	* @Title: deleteJob 
	* @Description: 删除定时任务
	* @param @param scheduleJob
	* @param @throws SchedulerException    设定文件 
	* @return void    返回类型 
	* @throws 
	*/ 
	
	public void deleteJob(ScheduleJob scheduleJob) throws SchedulerException {
		LOGGER.warn("删除定时任务=====" + JSON.toJSONString(scheduleJob));
		try{
			JobKey jobKey = JobKey.jobKey(scheduleJob.getJobName(), scheduleJob.getJobGroup());
			scheduler.deleteJob(jobKey);
		}catch (SchedulerException e) {
			LOGGER.error("删除定时任务失败====="+e.getMessage());
			throw e;
		}
	}

}
