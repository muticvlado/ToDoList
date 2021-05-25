package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.Task;
import com.example.demo.repository.TaskRepository;

@Service
public class TaskServiceImpl implements ITaskService {

	@Autowired
	private TaskRepository taskRepository;
	
	@Override
	public List<Task> tasks() {
		
		return taskRepository.findAll();
	}

	@Override
	public void save(Task task) {
		
		task.setPriority(task.getPriority().toUpperCase());
		taskRepository.save(task);
	}

	@Override
	public Task getById(long id) {
		
		return taskRepository.getById(id);
	}

	@Override
	public void finish(long id) {
		
		Task task = getById(id);
		task.setFinished(true);
		save(task);
	}

	@Override
	public void delete(long id) {
		
		taskRepository.deleteById(id);
	}
}
