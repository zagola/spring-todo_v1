package com.example.spring_todo_app;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RestController
public class TodoController {

    @Autowired
   TodoRepository todoRepository;

    @GetMapping("/alltodo")
    public List<Todo> getAll() {
        return todoRepository.getAll();
    }
}
