package com.zhh.service;

import java.util.List;

import org.quartz.SchedulerException;

import com.zhh.entity.ScheduleJob;


/**
 * @ClassName: IScheduleJobService
 * @Description: 定时任务service层接口定义
 * @author zhh
 * @date 2016-8-5 上午11:00:09
 * 
 */
public interface IScheduleJobService{

	
	/**
	 * @throws SchedulerException 
	 * 新增定时任务
	* @Title: addScheduleJob 
	* @Description: (这里用一句话描述这个方法的作用) 
	* @param @param entity
	* @param @return    设定文件 
	* @return ScheduleJob    返回类型 
	* @throws
	 */
	ScheduleJob addScheduleJob(ScheduleJob entity) throws SchedulerException;
	
	/**
	 * @throws SchedulerException  
	 * @Title: deleteScheduleJob 
	 * @Description: 删除定时任务
	 * @param @param entity
	 * @param @return    设定文件 
	 * @return ScheduleJob    返回类型 
	 * @throws 
	 */ 
	ScheduleJob deleteScheduleJob(ScheduleJob entity) throws SchedulerException;
	
	/**
	 * @throws SchedulerException 
	 * 
	* @Title: updateScheduleJob 
	* @Description: 修改定时任务
	* @param @param entity
	* @param @return    设定文件 
	* @return ScheduleJob    返回类型 
	* @throws
	 */
	ScheduleJob updateScheduleJob(ScheduleJob entity) throws SchedulerException;
	
	/**
	 * @throws SchedulerException 
	 * 
	* @Title: stopScheduleJob 
	* @Description: 暂停定时任务
	* @param @param entity
	* @param @return    设定文件 
	* @return ScheduleJob    返回类型 
	* @throws
	 */
	ScheduleJob stopScheduleJob(ScheduleJob entity) throws SchedulerException;
	
	/**
	 * @throws SchedulerException 
	 * 
	* @Title: recoverScheduleJob 
	* @Description: 恢复定时任务
	* @param @param entity
	* @param @return    设定文件 
	* @return ScheduleJob    返回类型 
	* @throws
	 */
	ScheduleJob recoverScheduleJob(ScheduleJob entity) throws SchedulerException;
	
	
	/** 
	* @Title: queryScheduleJob 
	* @Description: 根据条件查询定时任务 
	* @param @param entity
	* @param @return    设定文件 
	* @return ScheduleJob    返回类型 
	* @throws 
	*/ 
	
	ScheduleJob queryScheduleJob(ScheduleJob entity);
	
	/**
	 * @param end 
	 * @param start  
	* @Title: queryAllScheduleJob 
	* @Description: 查询所有任务
	* @param @param entity
	* @param @return    设定文件 
	* @return List<ScheduleJob>    返回类型 
	* @throws 
	*/ 
	List<ScheduleJob> queryAllScheduleJob(ScheduleJob entity);
	
	/** 
	* @Title: queryAllScheduleJob 
	* @Description: 查询正常运行的定时任务
	* @param @param entity
	* @param @return    设定文件 
	* @return List<ScheduleJob>    返回类型 
	* @throws 
	*/ 
	List<ScheduleJob> queryNormalScheduleJob(ScheduleJob entity);

	/**
	 * 查询总条数
	 * @param scheduleJobEntity
	 * @return
	 */
	int queryAllScheduleJobCount(ScheduleJob scheduleJobEntity);

	List<ScheduleJob> queryAllScheduleJobPage(ScheduleJob scheduleJobEntity,
			 int start, int end);
	
}
