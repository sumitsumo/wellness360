package com.java.wellness360.controllers;
import com.java.wellness360.models.Task;
import com.java.wellness360.services.TaskService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.UUID;

@RestController

public class TaskController
{
    @Autowired
    private TaskService taskService;

    //get all tasks -----
    @GetMapping("/tasks")
    public ResponseEntity<List<Task>> getAllTasks()
    {
        List<Task> taskList=taskService.getAllTasks();
        return ResponseEntity.ok().body(taskList);
    }

    //get a specific task -----
    @GetMapping("/tasks/{id}")
    public Task getTaskById(@PathVariable UUID id)
    {
        return taskService.getTaskById(id);
    }

    //create a task
    @PostMapping("/tasks")
    public Task createTask(@RequestBody Task task)
    {
        return taskService.createTask(task);
    }

    //update a task

    public Task updateTask(@RequestBody Task task, @PathVariable UUID id)
    {
        return taskService.updateTask(id,task);
    }

    //delete a task
    @DeleteMapping("/tasks/{id}")
    public Task deleteTask(@PathVariable UUID id)
    {
        return taskService.deleteTask(id);
    }

    //complete a task
    @PatchMapping("/tasks/{id}")
    public Task completeTask(@PathVariable UUID id)
    {
        return taskService.completeTask(id);
    }
}
