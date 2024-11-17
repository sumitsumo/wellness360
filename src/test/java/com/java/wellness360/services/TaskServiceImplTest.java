package com.java.wellness360.services;

import com.java.wellness360.models.Status;
import com.java.wellness360.models.Task;
import com.java.wellness360.repos.TaskRepo;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Date;
import java.util.Optional;
import java.util.UUID;

import static org.junit.jupiter.api.Assertions.*;

@ExtendWith(MockitoExtension.class)
class TaskServiceTest {

    @Mock
    private TaskRepo taskRepository;

    @InjectMocks
    private TaskService taskService;

    @Test
    void testGetTaskById() {
        UUID taskId = UUID.randomUUID();
//        Task task = new Task(taskId, "Test Task", "Description", LocalDateTime.now(), Status.pending, LocalDateTime.now(), LocalDateTime.now());
        Task task = new Task(taskId,"title","desc",new Date(),Status.in_progress,LocalDateTime.now(),LocalDateTime.now());
        taskService.createTask(task);
        Mockito.when(taskRepository.getTaskById(taskId)).thenReturn(task);

        Task result = taskService.getTaskById(taskId);
        assertNotNull(result);
        assertEquals(taskId, result.getId());
        assertEquals("Test Task", result.getTitle());
    }
}
