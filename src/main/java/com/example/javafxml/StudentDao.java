package com.example.javafxml;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class StudentDao {
    Connection connect;

    public StudentDao() throws ClassNotFoundException, SQLException {
        Class.forName("com.mysql.cj.jdbc.Driver");
        connect = DriverManager.getConnection("jdbc:mysql://localhost:3306/" + "StudentsData", "root", "opuruiche");

    }

    public void saveStudent(Student student) throws SQLException {
        PreparedStatement statement = connect.prepareStatement("insert into Students(FirstName,LastName,Email,course,age)values(?,?,?,?,?) ");
        statement.setString(1, student.getFirstName());
        statement.setString(2, student.getLastName());
        statement.setString(3, student.getEmail());
        statement.setString(4, student.getCourse());
        statement.setInt(5, student.getAge());
        statement.execute();
    }

    public List<Student> getAllStudents() throws SQLException {
        PreparedStatement statement = connect.prepareStatement("select * from Students;");
        statement.execute();
        ResultSet resultSet = statement.getResultSet();
        ArrayList<Student> studentsList = new ArrayList<>();
        while (resultSet.next()) {
            String FirstName = resultSet.getString("FirstName");
            String LastName = resultSet.getString("LastName");
            String Email = resultSet.getString("Email");
            String Course = resultSet.getString("Course");
            int Age = resultSet.getInt("Age");


            Student student = new Student(FirstName,LastName,Email,Course,Age);
            studentsList.add(student);
        }
        return studentsList;
    }
}
