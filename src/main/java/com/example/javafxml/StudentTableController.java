package com.example.javafxml;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;

import java.net.URL;
import java.sql.SQLException;
import java.util.ResourceBundle;

public class StudentTableController implements Initializable{
    @FXML
    TableView<Student> studentTable;

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        ObservableList<Student> studentsList

        try{
            StudentDao dao = new StudentDao();
            studentsList = (ObservableList<Student>) dao.getAllStudents();

        } catch (SQLException e){
            throw new RuntimeException(e);
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }

        TableColumn<Student, String> FirstNameColumn = new TableColumn<>();
//        FirstNameColumn.setCellValueFactory(cellData -> cellData.getValue().FirstNameProperty);
    }
}
