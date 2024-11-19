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
    public ResponseEntity<Task> getTaskById(@PathVariable UUID id)
    {
        Task response=taskService.getTaskById(id);
        return ResponseEntity.ok().body(response);
    }

    //create a task
    @PostMapping("/tasks")
    public ResponseEntity<Task> createTask(@RequestBody Task task)
    {
        Task response= taskService.createTask(task);
        return ResponseEntity.ok().body(response);
    }

    //update a task

    public ResponseEntity<Task> updateTask(@RequestBody Task task, @PathVariable UUID id)
    {
        Task response= taskService.updateTask(id,task);
        return ResponseEntity.ok().body(response);
    }

    //delete a task
    @DeleteMapping("/tasks/{id}")
    public ResponseEntity<Task> deleteTask(@PathVariable UUID id)
    {
        Task task= taskService.deleteTask(id);
        return ResponseEntity.ok().body(task);
    }

    //complete a task
    @PatchMapping("/tasks/{id}")
    public ResponseEntity<Task> completeTask(@PathVariable UUID id)
    {
        Task response= taskService.completeTask(id);
        return ResponseEntity.ok().body(response);
    }
}
