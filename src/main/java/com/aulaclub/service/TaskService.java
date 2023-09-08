package com.aulaclub.service;

import java.util.List;

import com.aulaclub.binding.Task;

public interface TaskService {
	
	public List<Task> getAllTasks(); 

	public String upsert(Task task); 
    
	public Task putById(Integer tid);
	
	

}
