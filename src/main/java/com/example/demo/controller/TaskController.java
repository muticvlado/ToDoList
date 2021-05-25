package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.demo.model.Task;
import com.example.demo.service.ITaskService;

@Controller
public class TaskController {
	
	@Autowired
	private ITaskService taskService;
	
	@RequestMapping("/")
	public String index(Model model) {
		
		model.addAttribute("tasks", taskService.tasks());
		return "index";
	}
	
	@RequestMapping("/task-form")
	public String getAddTaskForm(Model model) {
		
		model.addAttribute("task", new Task());
		return "task-form";
	}
	
	@RequestMapping("/save-task")
	public String saveTask(@ModelAttribute Task task) {
		
		taskService.save(task);
		return "redirect:/";
	}
	
	@RequestMapping("/update-task")
	public String getUpdateTask(@RequestParam long id, Model model) {
		
		model.addAttribute("task", taskService.getById(id));
		return "task-form";
	}
	
	@RequestMapping("/complete-task")
	public String complete(@RequestParam long id) {
		
		taskService.finish(id);
		return "redirect:/";
	}
	
	@RequestMapping("/delete-task")
	public String deleteTask(@RequestParam long id) {
		
		taskService.delete(id);
		return "redirect:/";
	}
}
