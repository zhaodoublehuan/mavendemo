package com.zhh.service;

import org.quartz.SchedulerException;

import com.zhh.entity.ScheduleJob;




/**
* @ClassName: IScheduleJobService
* @Description: 定时任务service
* @author zhh
* @date 2016-8-5 上午8:41:05
* 
*/

public interface IJobManagerService {
	
	/** 
	* @Title: addJob 
	* @Description: 添加定时任务
	* @param @param scheduleJob
	* @param @throws SchedulerException    设定文件 
	* @return void    返回类型 
	* @throws 
	*/ 
	
	public void addJob(ScheduleJob scheduleJob) throws SchedulerException;
	
	/** 
	* @Title: rescheduleJob 
	* @Description: 修改定时任务 
	* @param @param scheduleJob
	* @param @throws SchedulerException    设定文件 
	* @return void    返回类型 
	* @throws 
	*/ 
	
	public void rescheduleJob(ScheduleJob scheduleJob) throws SchedulerException;
	
	/** 
	* @Title: pauseJob 
	* @Description: 暂停定时任务
	* @param @param scheduleJob
	* @param @throws SchedulerException    设定文件 
	* @return void    返回类型 
	* @throws 
	*/ 
	
	public void pauseJob(ScheduleJob scheduleJob) throws SchedulerException;
	
	/** 
	* @Title: resumeJob 
	* @Description: 恢复定时任务
	* @param @param scheduleJob
	* @param @throws SchedulerException    设定文件 
	* @return void    返回类型 
	* @throws 
	*/ 
	
	public void resumeJob(ScheduleJob scheduleJob) throws SchedulerException;
	
	/** 
	* @Title: triggerJob 
	* @Description: 立即执行一次定时任务
	* @param @param scheduleJob
	* @param @throws SchedulerException    设定文件 
	* @return void    返回类型 
	* @throws 
	*/ 
	
	public void triggerJob(ScheduleJob scheduleJob) throws SchedulerException;
	
	
	/** 
	* @Title: 删除定时任务 
	* @Description: TODO(这里用一句话描述这个方法的作用) 
	* @param @param scheduleJob
	* @param @throws SchedulerException    设定文件 
	* @return void    返回类型 
	* @throws 
	*/ 
	
	public void deleteJob(ScheduleJob scheduleJob) throws SchedulerException;

}
