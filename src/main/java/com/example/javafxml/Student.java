package com.example.javafxml;

import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class Student {
    private String FirstName;
    private String LastName;
    private String Email;
    private String Course;
    private int Age;

    public Student(String FirstName, String LastName, String Email, String Course, int Age) {
        this.FirstName = FirstName;
        this.LastName = LastName;
        this.Email = Email;
        this.Course = Course;
        this.Age = Age;
    }

    public Student(TextField FirstName, TextField LastName, TextField Email, TextField Course, TextField Age, Button Submit) {
    }

    public String getFirstName() {
        return FirstName;
    }

    public String getLastName() {
        return LastName;
    }

    public String getEmail() {
        return Email;
    }

    public String getCourse() {
        return Course;
    }

    public int getAge() {
        return Age;
    }
}
