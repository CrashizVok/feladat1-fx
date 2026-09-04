package com.example.feladat;

public class Students {
    private Student[] students;

    public Student[] getStudents() {
        return students;
    }

    public void setStudents(Student[] students) {
        this.students = students;
    }

    public Students(){
        students = new Student[200];
    }

    public Student[] loadFromFile(String filename){
        return getStudents();
    }
}
