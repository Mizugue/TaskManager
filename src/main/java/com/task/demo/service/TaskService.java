package com.task.demo.service;

import com.task.demo.entity.Task;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;

public interface TaskService {

    List<Task> findAll();

    Task findById(int theId);

    Task save(Task task);

    void deleteById(int theId);

}
