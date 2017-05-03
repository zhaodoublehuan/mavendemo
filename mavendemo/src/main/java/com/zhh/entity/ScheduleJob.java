
package com.zhh.entity;

/**
* @ClassName: ScheduleJob
* @memoription: 定时任务的实体类
* @author zhh
* @date 2016-8-5 下午3:37:12
* 
*/

public class ScheduleJob {
    /**
    * @Fields id : 任务ID
    */
    private String id;

    /**
    * @Fields jobName : 任务名称
    */
    private String jobName;

    /**
    * @Fields jobGroup : 任务组
    */
    private String jobGroup;

    /**
    * @Fields jobStatus : 任务状态    0禁用 1启用 2删除
    */
    private String jobStatus;

    /**
    * @Fields cronExpression : 任务执行表达式
    */
    private String cronExpression;

    /**
    * @Fields memo : 任务描述
    */
    private String memo;
    
    /**
    * @Fields jobUrl : 任务执行需要访问的URL
    */
    private String jobUrl;

	/** 
	* @Title: getId 
	* @memoription: 获取任务id
	* @param @return    设定文件 
	* @return String    返回类型 
	* @throws 
	*/ 
	
	public String getId() {
        return id;
    }

    /** 
    * @Title: setId 
    * @memoription: 设置任务id
    * @param @param id    设定文件 
    * @return void    返回类型 
    * @throws 
    */ 
    
    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    /** 
    * @Title: getJobName 
    * @memoription: 获取任务名称
    * @param @return    设定文件 
    * @return String    返回类型 
    * @throws 
    */ 
    
    public String getJobName() {
        return jobName;
    }

    /** 
    * @Title: setJobName 
    * @memoription: 设置任务名称
    * @param @param jobName    设定文件 
    * @return void    返回类型 
    * @throws 
    */ 
    
    public void setJobName(String jobName) {
        this.jobName = jobName == null ? null : jobName.trim();
    }

    /** 
    * @Title: getJobGroup 
    * @memoription: 获取任务分组
    * @param @return    设定文件 
    * @return String    返回类型 
    * @throws 
    */ 
    
    public String getJobGroup() {
        return jobGroup;
    }

    /** 
    * @Title: setJobGroup 
    * @memoription: 设置任务分组
    * @param @param jobGroup    设定文件 
    * @return void    返回类型 
    * @throws 
    */ 
    
    public void setJobGroup(String jobGroup) {
        this.jobGroup = jobGroup == null ? null : jobGroup.trim();
    }

    /** 
    * @Title: getJobStatus 
    * @memoription: 获取任务状态
    * @param @return    设定文件 
    * @return String    返回类型 
    * @throws 
    */ 
    
    public String getJobStatus() {
        return jobStatus;
    }

    /** 
    * @Title: setJobStatus 
    * @memoription: 设置任务状态 
    * @param @param jobStatus    设定文件 
    * @return void    返回类型 
    * @throws 
    */ 
    
    public void setJobStatus(String jobStatus) {
        this.jobStatus = jobStatus == null ? null : jobStatus.trim();
    }

    /** 
    * @Title: getCronExpression 
    * @memoription: 获取任务执行表达式
    * @param @return    设定文件 
    * @return String    返回类型 
    * @throws 
    */ 
    
    public String getCronExpression() {
        return cronExpression;
    }

    /** 
    * @Title: setCronExpression 
    * @memoription: 设置任务执行表达式
    * @param @param cronExpression    设定文件 
    * @return void    返回类型 
    * @throws 
    */ 
    
    public void setCronExpression(String cronExpression) {
        this.cronExpression = cronExpression == null ? null : cronExpression.trim();
    }

    /** 
    * @Title: getmemo 
    * @memoription: 获取任务描述 
    * @param @return    设定文件 
    * @return String    返回类型 
    * @throws 
    */ 
    
    public String getMemo() {
        return memo;
    }

    /** 
    * @Title: setmemo 
    * @memoription: 设置任务描述
    * @param @param memo    设定文件 
    * @return void    返回类型 
    * @throws 
    */ 
    
    public void setMemo(String memo) {
        this.memo = memo == null ? null : memo.trim();
    }
    
    /** 
    * @Title: getJobUrl 
    * @memoription: 获取任务执行URL
    * @param @return    设定文件 
    * @return String    返回类型 
    * @throws 
    */ 
    
    public String getJobUrl() {
		return jobUrl;
	}

	/** 
	* @Title: setJobUrl 
	* @memoription: 设置任务执行URL
	* @param @param jobUrl    设定文件 
	* @return void    返回类型 
	* @throws 
	*/ 
	
	public void setJobUrl(String jobUrl) {
		this.jobUrl = jobUrl;
	}
}