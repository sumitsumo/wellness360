package com.java.wellness360.repos;

import com.java.wellness360.exceptions.TaskNotFoundException;
import com.java.wellness360.models.Task;
import org.springframework.stereotype.Repository;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.UUID;

@Repository
public class TaskRepoImpl implements TaskRepo
{
    private final HashMap<UUID, Task> tasks=new HashMap<>();
    @Override
    public Task saveTask(Task task)
    {
        return tasks.put(task.getId(),task);
    }

    @Override
    public Task deleteTask(UUID id) {
        if(!tasks.containsKey(id))
            throw new TaskNotFoundException("Task not found");
        return tasks.remove(id);
    }

    @Override
    public List<Task> getAllTasks()
    {
        List<Task> taskList=new ArrayList<>();
        if(tasks.isEmpty())
            throw new TaskNotFoundException("No Tasks are found");
        taskList.addAll(tasks.values());
        return taskList;
    }

    @Override
    public Task getTaskById(UUID id) {
        if(!tasks.containsKey(id))
            throw new TaskNotFoundException("Task not found");
        return tasks.get(id);
    }
}
