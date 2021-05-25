package com.example.demo.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table
public class Task {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column
	private long id;
	@Column
	private String priority;
	@Column
	private String notice;
	@Column
	private boolean finished;
	
	public Task() {

	}

	public Task(String priority, String notice, boolean finished) {
		super();
		this.priority = priority;
		this.notice = notice;
		this.finished = finished;
	}

	public Task(long id, String priority, String notice, boolean finished) {
		super();
		this.id = id;
		this.priority = priority;
		this.notice = notice;
		this.finished = finished;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getPriority() {
		return priority;
	}

	public void setPriority(String priority) {
		this.priority = priority;
	}

	public String getNotice() {
		return notice;
	}

	public void setNotice(String notice) {
		this.notice = notice;
	}

	public boolean isFinished() {
		return finished;
	}

	public void setFinished(boolean finished) {
		this.finished = finished;
	}
}
