package com.buffalo.edu.entity;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Id;

import com.fasterxml.jackson.annotation.JsonFormat;

@Entity
public class Sprint {
	
	@Id
	private String sprintNum;
	@JsonFormat(shape=JsonFormat.Shape.STRING, pattern="dd-MM-yyyy")
	private Date startDate;
	@JsonFormat(shape=JsonFormat.Shape.STRING, pattern="dd-MM-yyyy")
	private Date endDate;
	private int numOfDays;
	
	public Sprint() {
		super();
	}

	public Sprint(String sprintNum, Date startDate, Date endDate, int numOfDays) {
		super();
		this.sprintNum = sprintNum;
		this.startDate = startDate;
		this.endDate = endDate;
		this.numOfDays = numOfDays;
	}

	public String getSprintNum() {
		return sprintNum;
	}

	public void setSprintNum(String sprintNum) {
		this.sprintNum = sprintNum;
	}

	public Date getStartDate() {
		return startDate;
	}

	public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}

	public Date getEndDate() {
		return endDate;
	}

	public void setEndDate(Date endDate) {
		this.endDate = endDate;
	}

	public int getNumOfDays() {
		return numOfDays;
	}

	public void setNumOfDays(int numOfDays) {
		this.numOfDays = numOfDays;
	}

	@Override
	public String toString() {
		return "Sprint [sprintNum=" + sprintNum + ", startDate=" + startDate + ", endDate=" + endDate + ", numOfDays="
				+ numOfDays + "]";
	}
	
}
