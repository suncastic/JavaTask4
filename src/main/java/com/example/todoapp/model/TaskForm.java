package com.example.todoapp.model;

public class TaskForm {
    String title;
    String description;

    public TaskForm(){}

    public TaskForm(String title, String description) {
        this.title = title;
        this.description = description;
    }

    //Title
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    //Description
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
