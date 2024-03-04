package com.assignment;

import java.io.Serializable;

public class Project implements Serializable {
	String projectCode;
    String projectName;
    int projectduration;
    
    Project(String projectCode,String projectName,int projectduration){
    	this.projectCode = projectCode;
    	this.projectName = projectName;
    	this.projectduration = projectduration;
    	
    }
    @Override
    public String toString() {
        return "Project [projectCode=" + projectCode + ", projectName=" + projectName +
                ", projectStrength=" + projectduration + "]";
    }
	/**
	 * @return the projectCode
	 */
	public String getProjectCode() {
		return projectCode;
	}
	/**
	 * @param projectCode the projectCode to set
	 */
	public void setProjectCode(String projectCode) {
		this.projectCode = projectCode;
	}
	/**
	 * @return the projectName
	 */
	public String getProjectName() {
		return projectName;
	}
	/**
	 * @param projectName the projectName to set
	 */
	public void setProjectName(String projectName) {
		this.projectName = projectName;
	}
	/**
	 * @return the projectStrength
	 */
	public int getProjectStrength() {
		return projectduration;
	}
	/**
	 * @param projectStrength the projectStrength to set
	 */
	public void setProjectStrength(int projectStrength) {
		this.projectduration = projectStrength;
	}

}
