package com.aulaclub.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.aulaclub.binding.Task;
import com.aulaclub.repo.TaskRepository;

@Service
public class TaskServiceImpl implements TaskService {

	@Autowired
	private TaskRepository taskRepo;
	
	
	@Override
	public List<Task> getAllTasks() {
		List<Task> findAll = taskRepo.findAll();
		return findAll;
	} 
	
	@Override
	public String upsert(Task course) {
		taskRepo.save(course);
		return "Success";
	}

	
	@Override
	public Task putById(Integer tid) {
		Optional<Task> findById = taskRepo.findById(tid);
		
		if(findById.isPresent()) {
			return findById.get();
		}
		return null;
	}

	

}
