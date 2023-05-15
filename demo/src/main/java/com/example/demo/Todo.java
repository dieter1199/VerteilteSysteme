package com.example.demo;

public class Todo {
    private static int counter = 0;
    private int id;
    private String todo;
    private int priority;

    public Todo() {
        this.id = ++counter; // Increment the counter and assign it to id
    }

    // Getter and Setter methods
    public int getId() {
        return id;
    }
    
    public String getTodo() {
        return todo;
    }

    public void setTodo(String todo) {
        this.todo = todo;
    }

    public int getPriority() {
        return priority;
    }

    public void setPriority(int priority) {
        this.priority = priority;
    }
}
