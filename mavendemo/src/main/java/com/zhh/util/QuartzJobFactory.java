package com.zhh.util;

import org.quartz.Job;
import org.quartz.JobExecutionContext;
import org.quartz.JobExecutionException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.zhh.entity.ScheduleJob;

/**
* @ClassName: QuartzJobFactory
* @Description: 定时执行的类，需要实现job
* @author zhh
* @date 2016-8-5 下午3:52:51
* 
*/

public class QuartzJobFactory implements Job {
	
	private static final Logger LOGGER = LoggerFactory.getLogger(QuartzJobFactory.class);

	/* (非 Javadoc) 
	* <p>Title: execute</p> 
	* <p>Description: 实现job的方法 </p> 
	* @param context
	* @throws JobExecutionException 
	* @see org.quartz.Job#execute(org.quartz.JobExecutionContext) 
	*/ 
	
	public void execute(JobExecutionContext context) throws JobExecutionException {
		try{
			/* 获取当前的定时实体 */
			ScheduleJob scheduleJob = (ScheduleJob) context.getMergedJobDataMap().get("scheduleJob");
			LOGGER.warn("定时任务成功运行"+"任务名称 = [" + scheduleJob.getJobName() + "]");
			String httpUrl = scheduleJob.getJobUrl();
			LOGGER.warn("定时任务执行url ==== [" + httpUrl + "]*** 任务id="+scheduleJob.getId());
		}
		catch (RuntimeException e) {
			LOGGER.error("定时任务运行失败"+e.getMessage());
			throw e;
		}
	}
}
