package com.java.wellness360.services;

import com.java.wellness360.models.Task;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
public interface TaskService
{
    Task createTask(Task task);
    Task updateTask(UUID id,Task task);
    Task getTaskById(UUID id);
    Task deleteTask(UUID id);
    Task completeTask(UUID id);
    List<Task> getAllTasks();
}
