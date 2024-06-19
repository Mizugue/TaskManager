package com.task.demo.dao;


import com.task.demo.entity.Task;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;

public interface TaskRepository extends JpaRepository<Task, Integer> {

    public List<Task> findAllByOrderByStatusDesc();
}