package com.crud.repository;

import org.springframework.data.repository.CrudRepository;

import com.crud.entity.Task;

public interface TaskRepository extends CrudRepository<Task, String> {

}
