package com.java.wellness360.repos;

import com.java.wellness360.models.Task;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.UUID;

@Repository
public interface TaskRepo
{
    Task saveTask(Task task);
    Task deleteTask(UUID id);
    List<Task> getAllTasks();
    Task getTaskById(UUID id);
//    Task updateTask(UUID id, Task task);
}
