package com.aulaclub.binding;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity  
@Table(name = "TASK_DTLS")
public class Task {

	@Id   
	@GeneratedValue(strategy=GenerationType.IDENTITY)  
	private Integer tid;
	private String title;
	private String description;
	private String status;
	
	
}
