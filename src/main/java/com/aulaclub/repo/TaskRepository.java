package com.aulaclub.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.aulaclub.binding.Task;

public interface TaskRepository extends JpaRepository<Task,Integer> {
	
	

}
