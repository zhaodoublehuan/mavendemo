package com.zhh.dao;

import java.util.List;

import com.zhh.entity.ScheduleJob;



/**
 * 定时任务DAO层接口定义
 * @ClassName: IScheduleJobDao
 * @Description: (这里用一句话描述这个类的作用)
 * @author zhh
 * @date 2016-8-5 上午9:48:21
 *
 */
public interface IScheduleJobDao {

	/**
	 * 新增定时任务
	* @Title: addScheduleJob 
	* @Description: (这里用一句话描述这个方法的作用) 
	* @param @param entity
	* @param @return    设定文件 
	* @return ScheduleJob    返回类型 
	* @throws
	 */
	int addScheduleJob(ScheduleJob entity);
	
	/**
	 * 
	* @Title: updateScheduleJob 
	* @Description: 修改定时任务
	* @param @param entity
	* @param @return    设定文件 
	* @return ScheduleJob    返回类型 
	* @throws
	 */
	ScheduleJob updateScheduleJob(ScheduleJob entity);
	
	/** 
	* @Title: deleteScheduleJob 
	* @Description: 删除定时任务
	* @param @param entity
	* @param @return    设定文件 
	* @return ScheduleJob    返回类型 
	* @throws 
	*/ 
	
	ScheduleJob deleteScheduleJob(ScheduleJob entity);
	
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
	* @Title: queryScheduleJobEntity 
	* @Description: 根据条件查询定时任务 
	* @param @param entity
	* @param @return    设定文件 
	* @return ScheduleJob    返回类型 
	* @throws 
	*/ 
	
	ScheduleJob queryScheduleJobEntity(ScheduleJob entity);
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

	int queryAllScheduleJobCount(ScheduleJob scheduleJobEntity);

	List<ScheduleJob> queryAllScheduleJobPage(ScheduleJob entity, int start,
			int end);
}
