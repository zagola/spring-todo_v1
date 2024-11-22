package com.example.spring_todo_app;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor

public class Task {
    public String getTask() {
        return task;
    }

    private String task;
}