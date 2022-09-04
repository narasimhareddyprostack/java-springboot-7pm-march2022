package com.crudOnce;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.crud.service.TaskService;

@RestController
public class TaskController {
	@Autowired
	TaskService taskServcie;
	
	/*
	API : localhost:7788/todo/task
	Method:GET
	Fields: No
	*/
	@GetMapping("/task")
	public List getAllTask() {
			return taskServcie.getAllTask();
	}
	
	//localhost:7788/todo/add
	//public void addNewTask() {}
	//localhost:7788/todo/update/104
	//public void updateTask() {}
	
	//localhost:7788/todo/delete/102
	//public void deleteTask() {}

}
