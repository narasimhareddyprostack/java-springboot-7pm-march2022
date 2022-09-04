package com.crud.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.crud.repository.TaskRepository;

@Service
public class TaskService {
	
	@Autowired
	TaskRepository taskRepo;
	
	public List getAllTask() {
		List tasks = new ArrayList();
		taskRepo.findAll().forEach(tasks::add);
		return tasks;
	}
}
