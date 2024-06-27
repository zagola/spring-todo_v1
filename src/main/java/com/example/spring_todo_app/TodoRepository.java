package com.example.spring_todo_app;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;

import java.util.List;

@Repository
public class TodoRepository {
    @Autowired
    JdbcTemplate jdbcTemplate;

    public List<Todo> getAll() {
        return jdbcTemplate.query("SELECT id, description FROM Todo",
                BeanPropertyRowMapper.newInstance(Todo.class));
    }

}
