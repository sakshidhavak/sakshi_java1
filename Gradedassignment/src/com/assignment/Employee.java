package com.assignment;

import java.io.Serializable;

public class Employee implements Serializable{
	String employeeId;
	String employeeName;
	String employeePhone;
	String employeeAddress;
	int employeeSalary;
	
	Employee(String employeeId,String employeeName,String employeePhone,String employeeAddress,int employeeSalary){
		this.employeeId = employeeId;
		this.employeeName = employeeName;
		this.employeePhone = employeePhone;
		this.employeeAddress = employeeAddress;
		this.employeeSalary = employeeSalary;
	}
	@Override
    public String toString() {
        return "Employee [employeeId=" + employeeId + ", employeeName=" + employeeName +
                ", employeePhone=" + employeePhone + ", employeeAddress=" + employeeAddress +
                ", employeeSalary=" + employeeSalary + "]";
    }
	/**
	 * @return the employeeId
	 */
	public String getEmployeeId() {
		return employeeId;
	}
	/**
	 * @param employeeId the employeeId to set
	 */
	public void setEmployeeId(String employeeId) {
		this.employeeId = employeeId;
	}
	/**
	 * @return the employeeName
	 */
	public String getEmployeeName() {
		return employeeName;
	}
	/**
	 * @param employeeName the employeeName to set
	 */
	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}
	/**
	 * @return the employeePhone
	 */
	public String getEmployeePhone() {
		return employeePhone;
	}
	/**
	 * @param employeePhone the employeePhone to set
	 */
	public void setEmployeePhone(String employeePhone) {
		this.employeePhone = employeePhone;
	}
	/**
	 * @return the employeeAddress
	 */
	public String getEmployeeAddress() {
		return employeeAddress;
	}
	/**
	 * @param employeeAddress the employeeAddress to set
	 */
	public void setEmployeeAddress(String employeeAddress) {
		this.employeeAddress = employeeAddress;
	}
	/**
	 * @return the employeeSalary
	 */
	public int getEmployeeSalary() {
		return employeeSalary;
	}
	/**
	 * @param employeeSalary the employeeSalary to set
	 */
	public void setEmployeeSalary(int employeeSalary) {
		this.employeeSalary = employeeSalary;
	}

}
