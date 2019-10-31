package io.zipcoder;

import java.util.ArrayList;

public class Classroom {
    private Student[] students;         // this is an array of students.
    private int maxNumberOfStudents; //this represents the max length of the students array.


    Classroom (int maxNumberOfStudents) {
        this.students = new Student [maxNumberOfStudents];
    }

    Classroom (Student [] students)    {
         this.students = students;

    }

    Classroom ()    {
         this.students = new Student [30];
    }

    public Student[] getStudents() {
        return students;
    }

    public double getClassAverageExamScore() {
        Integer counter = 0;
        Double sum = 0.0;
        for (Student student : students) {
            ArrayList<Double> examScores = student.getExamScoresDouble();
            for (Double scores : examScores) {
                sum += scores;
                counter++;
            }
        }
        return sum / counter;
    }










}
