package com.example.demo;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.*;


import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("/api/todos")
public class TodoController {
    private List<Todo> todoList = new ArrayList<>();

    @PostMapping
    public Todo addTodo(@RequestBody Todo newTodo) {
        todoList.add(newTodo);
        return newTodo; // return the added Todo object
    }

    @GetMapping
    public List<Todo> getTodos() {
        return todoList;
    }

    // Get by ID
    @GetMapping("/{id}")
    public Todo getTodoById(@PathVariable int id) {
        return todoList.stream()
                .filter(t -> t.getId() == id)
                .findFirst()
                .orElse(null);  // return null if no Todo with the provided ID is found
    }

    // Update the Todo with the ID
    @PutMapping("/{id}")
    public Todo updateTodo(@PathVariable int id, @RequestBody Todo updatedTodo) {
        todoList = todoList.stream()
                .map(t -> t.getId() == id ? updatedTodo : t)
                .collect(Collectors.toList());
        return updatedTodo;
    }

    // Delete the Todo with the ID
    @DeleteMapping("/{id}")
    public String deleteTodo(@PathVariable int id) {
        todoList = todoList.stream()
                .filter(t -> t.getId() != id)
                .collect(Collectors.toList());
        return "Deleted Todo with ID: " + id;
    }
}
