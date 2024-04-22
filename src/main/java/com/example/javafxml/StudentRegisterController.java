package com.example.javafxml;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.sql.SQLException;

public class StudentRegisterController  {
    @FXML
    private TextField FirstName, LastName, Email, Age, Course;


    @FXML
    protected void Submit() throws SQLException, ClassNotFoundException {
        String FirstName = this.FirstName.getText();
        String LastName = this.LastName.getText();
        String Email = this.Email.getText();
        String Course = this.Course.getText();
        int Age = Integer.parseInt(this.Age.getText());

       Student student = new Student(FirstName, LastName, Email, Course, Age);
        StudentDao db = new StudentDao();
        db.saveStudent(student);
        this.FirstName.setText("");
        this.LastName.setText("");
        this.Email.setText("");
        this.Course.setText("");
        this.Age.setText("");

        Stage stage = (Stage) this.FirstName.getScene().getWindow();
        stage.close();


    }
}
