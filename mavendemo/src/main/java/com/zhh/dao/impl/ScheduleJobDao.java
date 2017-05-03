package com.zhh.dao.impl;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.zhh.dao.IScheduleJobDao;
import com.zhh.entity.ScheduleJob;

/**
 * @ClassName: ScheduleJobDao
 * @Description: 定时任务数据表DAO层实现
 * @author zhh
 * @date 2016-8-5 上午10:57:26
 * 
 */

public class ScheduleJobDao extends BaseDao  implements IScheduleJobDao {

	/**
	 * xml namespace
	 */
	private final static String NAMESPACE = "mapper.ScheduleJobMapper.";

	
	/* (非 Javadoc) 
	* <p>Title: addScheduleJob</p> 
	* <p>Description: 新增定时任务</p> 
	* @param entity
	* @return 
	* @see com.deppon.wqs.module.common.server.dao.IScheduleJobDao#addScheduleJob(com.deppon.wqs.module.common.shared.domain.ScheduleJob) 
	*/ 
	public int addScheduleJob(ScheduleJob entity) {
		return this.getSqlSession().insert(NAMESPACE + "addScheduleJob", entity);
	}

	/* (非 Javadoc) 
	* <p>Title: updateScheduleJob</p> 
	* <p>Description: 修改定时任务（包括修改内容、修改状态等）</p> 
	* @param entity
	* @return 
	* @see com.deppon.wqs.module.common.server.dao.IScheduleJobDao#updateScheduleJob(com.deppon.wqs.module.common.shared.domain.ScheduleJob) 
	*/ 
	public ScheduleJob updateScheduleJob(ScheduleJob entity) {
		int result = this.getSqlSession().update(NAMESPACE + "updateScheduleJob", entity);
		return result>0 ? entity : null;
	}

	/* (非 Javadoc) 
	* <p>Title: deleteScheduleJob</p> 
	* <p>Description: 删除定时任务</p> 
	* @param entity
	* @return 
	* @see com.deppon.wqs.module.common.server.dao.IScheduleJobDao#deleteScheduleJob(com.deppon.wqs.module.common.shared.domain.ScheduleJob) 
	*/ 
	public ScheduleJob deleteScheduleJob(ScheduleJob entity) {
		int result = this.getSqlSession().delete(NAMESPACE + "deleteScheduleJob", entity);
		return result>0 ? entity : null;
	}

	/* (非 Javadoc) 
	* <p>Title: queryScheduleJob</p> 
	* <p>Description: 根据id查询定时任务，返回实体</p> 
	* @param entity
	* @return 
	* @see com.deppon.wqs.module.common.server.dao.IScheduleJobDao#queryScheduleJob(com.deppon.wqs.module.common.shared.domain.ScheduleJob) 
	*/ 
	public ScheduleJob queryScheduleJob(ScheduleJob entity) {
		
		List<ScheduleJob> list =  this.getSqlSession().selectList
				(NAMESPACE + "queryScheduleJob", entity);
		if(list!=null && list.size()>0){
			return list.get(0);
		}
		return null;
	}
	/* (非 Javadoc) 
	* <p>Title: queryScheduleJobEntity</p> 
	* <p>Description: 根据id查询定时任务，返回实体</p> 
	* @param entity
	* @return 
	*/ 
	public ScheduleJob queryScheduleJobEntity(ScheduleJob entity) {
		
		List<ScheduleJob> list =  this.getSqlSession().selectList
				(NAMESPACE + "queryScheduleJobEntity", entity);
		if(list!=null && list.size()>0){
			return list.get(0);
		}
		return null;
	}
	/* (非 Javadoc) 
	* <p>Title: queryAllScheduleJob</p> 
	* <p>Description: 按照条件查询定时任务</p> 
	* @param entity
	* @return 
	* @see com.deppon.wqs.module.common.server.dao.IScheduleJobDao#queryAllScheduleJob(com.deppon.wqs.module.common.shared.domain.ScheduleJob) 
	*/ 
	public List<ScheduleJob> queryAllScheduleJob(ScheduleJob entity) {
		List<ScheduleJob> list =  this.getSqlSession().selectList
				(NAMESPACE + "queryScheduleJob", entity);
		return list;
	}

	public int queryAllScheduleJobCount(ScheduleJob scheduleJobEntity) {
		// TODO Auto-generated method stub
		return  this.getSqlSession().selectOne(NAMESPACE + "queryAllScheduleJobCount", scheduleJobEntity);
	}

	public List<ScheduleJob> queryAllScheduleJobPage(ScheduleJob entity,
			int start, int end) {
		Map<String,Object> map = new HashMap<String,Object>();
		map.put("entity", entity);
		map.put("start", start);
		map.put("end", end);
		List<ScheduleJob> list =  this.getSqlSession().selectList
				(NAMESPACE + "queryScheduleJobPage", map);
		return list;
	}

}
