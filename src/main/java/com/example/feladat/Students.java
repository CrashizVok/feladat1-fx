package com.example.feladat;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Scanner;

public class Students {
    private Student[] students;
    private int piece;

    public Students(){
        this.students = new Student[200];
        this.piece = 0;
    }

    public void loadFromFile(String filename) throws FileNotFoundException {
        File file = new File(filename);
        Scanner scanner = new Scanner(file);

        while (scanner.hasNextLine()) {
            String line = scanner.nextLine();
            String[] data = line.split(";");

            Student human = new Student();

            human.setAz(Integer.parseInt(data[0]));
            human.setVnev(data[1]);
            human.setKnev(data[2]);
            human.setNem(data[3]);
            human.setOsztaly(data[4]);
            human.setDatum(data[5]);
            human.setHely(data[6]);
            human.setMagassag(Integer.parseInt(data[7]));

            //
            this.students[this.piece] = human;
            this.piece++;
        }

        scanner.close();
    }
}
