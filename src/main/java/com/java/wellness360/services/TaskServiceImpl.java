package com.java.wellness360.services;

import com.java.wellness360.models.Status;
import com.java.wellness360.models.Task;
import com.java.wellness360.repos.TaskRepo;
import com.java.wellness360.repos.TaskRepoImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;
import java.util.UUID;

@Service
public class TaskServiceImpl implements TaskService
{
    @Autowired
    private TaskRepo taskRepo;

    @Override
    public Task createTask(Task task) {
        taskRepo.saveTask(task);
        return task;
    }

    @Override
    public Task updateTask(UUID id,Task task) {
        Task oldTask=taskRepo.getTaskById(id);
        oldTask.setCreatedAt(task.getCreatedAt());
        oldTask.setUpdatedAt(LocalDateTime.now());
        oldTask.setId(id);
        oldTask.setDescription(task.getDescription());
        oldTask.setStatus(task.getStatus());
        oldTask.setDueDate(task.getDueDate());
        oldTask.setTitle(task.getTitle());
        taskRepo.saveTask(oldTask);
        return oldTask;
    }

    @Override
    public Task getTaskById(UUID id) {
        return taskRepo.getTaskById(id);
    }

    @Override
    public Task deleteTask(UUID id) {
        return taskRepo.deleteTask(id);
    }

    @Override
    public Task completeTask(UUID id) {
        Task task = taskRepo.getTaskById(id);
        task.setStatus(Status.completed);
        return updateTask(id, task);
    }

    @Override
    public List<Task> getAllTasks() {
        return taskRepo.getAllTasks();
    }
}
