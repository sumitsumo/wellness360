package com.java.wellness360.models;

import lombok.*;

import javax.annotation.processing.Generated;
import java.time.LocalDateTime;
import java.util.Date;
import java.util.UUID;


@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Task
{

    private UUID id=UUID.randomUUID();
    private String title;
    private String description;
    private Date dueDate;
    private Status status=Status.in_progress;

    private LocalDateTime createdAt=LocalDateTime.now();
    private LocalDateTime updatedAt=LocalDateTime.now();


}
