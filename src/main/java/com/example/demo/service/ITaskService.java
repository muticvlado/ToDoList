package com.example.demo.service;

import java.util.List;

import com.example.demo.model.Task;

public interface ITaskService {
	
	List<Task> tasks();
	
	void save(Task task);
	
	Task getById(long id);
	
	void finish(long id);
	
	void delete(long id);
}
