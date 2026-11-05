package com.example.todoapp.model;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

import java.time.LocalDateTime;

public class Task {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    String title;
    String description;
    boolean completed;
    LocalDateTime createdAt;

    public Task(){}

    public Task(String title, String description, boolean completed, LocalDateTime createdAt) {
        this.title = title;
        this.description = description;
        this.completed = completed;
        this.createdAt= createdAt;
    }

    // Title
    public String getTitle(){
        return title;
    }
    public void setTitle(String title){
        this.title = title;
    }

    // Description
    public String getDescription(){
        return description;
    }
    public void setDescription(String description){
        this.description = description;
    }

    // Completed
    public boolean isCompleted() {
        return completed;
    }
    public void setCompleted(boolean completed) {
        this.completed = completed;
    }

    public LocalDateTime getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(LocalDateTime createdAt) {
        this.createdAt = createdAt;
    }
}
