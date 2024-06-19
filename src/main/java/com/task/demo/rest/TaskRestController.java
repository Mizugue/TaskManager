package com.task.demo.rest;

import java.util.List;

import com.task.demo.entity.Task;
import com.task.demo.service.TaskService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class TaskRestController {

    private TaskService taskService;

    @Autowired
    public TaskRestController(TaskService taskService) {
       this.taskService = taskService;
    }

    // expose "/employees" and return a list of employees
    @GetMapping("/tasks")
    public List<Task> findAll() {
        return taskService.findAll();
    }

    // add mapping for GET /employees/{employeeId}

    @GetMapping("/tasks/{taskId}")
    public Task getEmployee(@PathVariable int taskId) {

        Task task = taskService.findById(taskId);

        if (task == null) {
            throw new RuntimeException("Task id not found - " + taskId);
        }

        return task;
    }

    // add mapping for POST /employees - add new employee

    @PostMapping("/tasks")
    public Task addEmployee(@RequestBody Task task) {


        task.setId(0);

        Task dbTask = taskService.save(task);

        return dbTask;
    }

    // add mapping for PUT /employees - update existing employee

    @PutMapping("/tasks")
    public Task updateTask(@RequestBody Task task) {
        Task dbTask = taskService.save(task);
        return dbTask;
    }


    @DeleteMapping("/tasks/{tasksId}")
    public String deleteTask(@PathVariable int tasksId) {

        Task tempTask= taskService.findById(tasksId);


        if (tempTask == null) {
            throw new RuntimeException("Task id not found - " + tasksId);
        }

        taskService.deleteById(tasksId);
        return "Deleted task id - " + tasksId;
    }






}








