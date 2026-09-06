package com.example.feladat;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;

import java.io.FileNotFoundException;

public class DiakokController{
    @FXML
    private Students students;

    public void initialize() throws FileNotFoundException {
        students.loadFromFile("assets/diakok.csv");
    }
    @FXML
    public void save(){

    }
}