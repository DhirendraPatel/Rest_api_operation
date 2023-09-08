package com.aulaclub.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.aulaclub.binding.Task;
import com.aulaclub.service.TaskService;

@RestController
public class TaskRestController {

	@Autowired
	private TaskService taskService;
	
	//fetch all task
		@GetMapping("/tasks")
		public ResponseEntity<List<Task>> getAllTasks(){
			List<Task> allTasks = taskService.getAllTasks();
			return new ResponseEntity<>(allTasks,HttpStatus.OK);
		}
		
	
	//create new task
	@PostMapping("/task")
	public ResponseEntity<String> createCourse(@RequestBody Task task){ 
		String status = taskService.upsert(task);  
		return new ResponseEntity<>(status,HttpStatus.CREATED); 
	}
	
	//update the status of an existing task
	@PutMapping("/task/{tid}")
	public ResponseEntity<String> updateCourse(@RequestBody Task tid){ 
		String status = taskService.upsert(tid);  
		return new ResponseEntity<>(status,HttpStatus.OK);  
	}
		
}
