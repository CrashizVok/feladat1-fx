package com.example.feladat;
import javafx.fxml.FXML;
import javafx.scene.control.ListView;

import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Arrays;
import static com.example.feladat.Students.getStudents;

public class DiakokController{
    @FXML
    private Students students = new Students();

    @FXML
    private ListView listview;

    ArrayList<String> humans = new ArrayList<>();

    public void initialize() throws FileNotFoundException {
        students.loadFromFile("assets/diakok.csv");

        Student[] students = getStudents();
        for (Student line : students){
            if (line == null){continue;}
            String normalisedLine = String.valueOf(line);

            String[] splittedData = normalisedLine.split(" ");
            humans.add(Arrays.toString(splittedData));

        }
    }

        @FXML
        public void onClickMindenki(){;
        System.out.println(humans);

        ArrayList<String> humansSplitted = new ArrayList<>();

        for (String dataLine : humans) {
            System.out.println(dataLine); //[data,data]
            String[] coolerData = dataLine.split(",");
            System.out.println(coolerData[1]);

            String finalString = coolerData[0]+" "+coolerData[1]+", "+coolerData[2]+" ("+coolerData[3]+" "+coolerData[4]+", "+coolerData[5]+"cm)";

            listview.setAccessibleText(finalString);

        }
    }
}