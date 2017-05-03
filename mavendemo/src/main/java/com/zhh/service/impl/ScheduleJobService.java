package com.zhh.service.impl;

import java.util.List;

import org.quartz.SchedulerException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.zhh.dao.IScheduleJobDao;
import com.zhh.entity.ScheduleJob;
import com.zhh.service.IJobManagerService;
import com.zhh.service.IScheduleJobService;
import com.zhh.util.UUIDUtils;

/**
 * @ClassName: ScheduleJobService
 * @Description: 定时任务service层实现
 * @author zhh
 * @date 2016-8-5 上午11:05:57
 * 
 */
@Service
public class ScheduleJobService implements IScheduleJobService {

	
	/*
	 * @Fields JOB_STATUS_DELETE : 定时任务状态：删除
	 */
	private static final String JOB_STATUS_DELETE = "2";
	/*
	 * @Fields JOB_STATUS_STOP : 定时任务状态：暂停
	 */
	private static final String JOB_STATUS_STOP = "0";
	/*
	 * @Fields JOB_STATUS_NORMAL : 定时任务状态：正常
	 */
	private static final String JOB_STATUS_NORMAL = "1";
	/*
	 * 定时dao
	 */
	@Autowired
	private IScheduleJobDao scheduleJobDao;
	/*
	 * 定时程序实现service
	 */
	@Autowired
	private IJobManagerService jobManagerService;

	/*
	 * (non-Javadoc)
	 * 添加定时任务
	 * 
	 */
	@Transactional
	public ScheduleJob addScheduleJob(ScheduleJob entity) throws SchedulerException {
		if(entity==null){
			return null;
		}
		entity.setId(UUIDUtils.getUUID());
		
		entity.setJobStatus(JOB_STATUS_NORMAL);
		/*
		 * 添加定时任务表
		 */
		int result = scheduleJobDao.addScheduleJob(entity);
		if(result>0){
			try {
				/*
				 * 添加定时任务程序
				 */
				jobManagerService.addJob(entity);
			} catch (SchedulerException e) {
				e.printStackTrace();
				throw e;
			}
			return entity;
		}else{
			return null;
		}
	}
/*
 * (non-Javadoc)
 * 删除定时任务
 * 
 */
	@Transactional
	public ScheduleJob deleteScheduleJob(ScheduleJob entity) throws SchedulerException {
		if(entity==null){
			return null;
		}
		entity.setJobStatus(JOB_STATUS_DELETE);
		
		ScheduleJob delEntity = scheduleJobDao.queryScheduleJobEntity(entity);
		/*
		 * 删除定时任务操作表
		 */
		ScheduleJob result=scheduleJobDao.deleteScheduleJob(entity);
		if(result!=null){
			try {
				/*
				 * 删除定时任务操作系统
				 */
				jobManagerService.deleteJob(delEntity);
			} catch (SchedulerException e) {
				e.printStackTrace();
				throw e;
			}
			return entity;
		}else{
			return null;
		}
		 
	}
	/*
	 * (non-Javadoc)
	 * 修改定时任务
	 * 
	 */
	@Transactional
	public ScheduleJob updateScheduleJob(ScheduleJob entity) throws SchedulerException {
		if(entity==null){
			return null;
		}
		/*
		 * 修改定时任务操作表
		 */
		ScheduleJob result=scheduleJobDao.updateScheduleJob(entity);
		if(result!=null){
			try {
				/*
				 * 修改定时任务操作系统
				 */
				jobManagerService.rescheduleJob(entity);
			} catch (SchedulerException e) {
				e.printStackTrace();
			}
			return entity;
		}else{
			return null;
		}
	}
/*
 * (non-Javadoc)
 * 暂停定时任务
 */
	@Transactional
	public ScheduleJob stopScheduleJob(ScheduleJob entity) throws SchedulerException {
		if(entity==null){
			return null;
		}
		entity = scheduleJobDao.queryScheduleJob(entity);
		entity.setJobStatus(JOB_STATUS_STOP);
		/*
		 * 暂停定时任务操作表
		 */
		ScheduleJob result=scheduleJobDao.updateScheduleJob(entity);
		if(result!=null){
			try {
				/*
				 * 暂停定时任务操作系统
				 */
				jobManagerService.pauseJob(entity);
			} catch (SchedulerException e) {
				e.printStackTrace();
				throw e;
			}
			return entity;
		}else{
			return null;
		}
	}
	/*
	 * (non-Javadoc)
	 * 恢复定时任务
	 */
	@Transactional
	public ScheduleJob recoverScheduleJob(ScheduleJob entity) throws SchedulerException {
		if(entity==null){
			return null;
		}
		entity = scheduleJobDao.queryScheduleJob(entity);
		entity.setJobStatus(JOB_STATUS_NORMAL);
		/*
		 * 恢复定时任务操作表
		 */
		ScheduleJob result=scheduleJobDao.updateScheduleJob(entity);
		if(result!=null){
			try {
				/*
				 * 恢复定时任务操作系统
				 */
				jobManagerService.resumeJob(entity);
			} catch (SchedulerException e) {
				e.printStackTrace();
				throw e;
			}
			return entity;
		}else{
			return null;
		}
	}
	public int queryAllScheduleJobCount(ScheduleJob scheduleJobEntity) {
		return scheduleJobDao.queryAllScheduleJobCount(scheduleJobEntity);
	}
	
	public ScheduleJob queryScheduleJob(ScheduleJob entity) {
		if(entity==null){
			entity = new ScheduleJob();
		}
		return scheduleJobDao.queryScheduleJob(entity);
	}

	public List<ScheduleJob> queryAllScheduleJob(ScheduleJob entity) {
		if(entity==null){
			entity = new ScheduleJob();
		}
		return scheduleJobDao.queryAllScheduleJob(entity);
	}

	public List<ScheduleJob> queryNormalScheduleJob(ScheduleJob entity) {
		if(entity==null){
			entity = new ScheduleJob();
		}
		entity.setJobStatus(JOB_STATUS_NORMAL);
		return null;
	}

	public List<ScheduleJob> queryAllScheduleJobPage(
			ScheduleJob entity, int start, int end) {
		return scheduleJobDao.queryAllScheduleJobPage(entity,start,end);
	}


	
}
