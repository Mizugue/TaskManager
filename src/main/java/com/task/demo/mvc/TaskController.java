package com.task.demo.mvc;

import com.task.demo.entity.Task;
import com.task.demo.service.TaskService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import javax.xml.crypto.Data;
import java.util.Date;
import java.util.List;

@Controller
@RequestMapping("/")
public class TaskController {

    private TaskService taskService;


    @Autowired
    public TaskController(TaskService taskService){
        this.taskService = taskService;
    }

    @GetMapping("/tasks")
    public String listTasks(Model theModel) {
        List<Task> taskList = taskService.findAll();
        theModel.addAttribute("tasks", taskList);
        return "listex";
    }

    @GetMapping("/about")
    public String about() {
        return "about";
    }

    @GetMapping("/edit")
    public String editTasks(Model theModel) {
        List<Task> taskList = taskService.findAll();
        theModel.addAttribute("tasks", taskList);
        return "edit";
    }

    @GetMapping("/add")
    public String add(Model theModel) {
        Task task = new Task();
        theModel.addAttribute("task", task);
        return "crud/add";
    }


    @GetMapping("/update")
    public String update(@RequestParam("taskId") int id, Model model) {
        Task task = taskService.findById(id);
        model.addAttribute("task", task);
        return "crud/add";
    }


    @GetMapping("/delete")
    public String delete(@RequestParam("taskId") int id, Model model) {
        taskService.deleteById(id);
        return "redirect:/edit";
    }



    @PostMapping("/save")
    public String saveTask(@ModelAttribute("task") Task updatedTask) {
        Task existingTask = taskService.findById(updatedTask.getId());
        updatedTask.setCreation_date(existingTask.getCreation_date());
        taskService.save(updatedTask);
        return "redirect:/edit";
    }

    @GetMapping("/task/{id}")
    public String getTask(@PathVariable("id") int id, Model model){
        Task task = taskService.findById(id);
        model.addAttribute("task", task);
        return "task";
    }
















}
