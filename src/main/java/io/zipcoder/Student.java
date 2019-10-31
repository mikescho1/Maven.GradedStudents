package io.zipcoder;

import java.lang.reflect.Array;
import java.math.RoundingMode;
import java.text.DecimalFormat;

import java.util.ArrayList;
import java.util.Arrays;

public class Student {


    private String firstName;
    private String lastName;
    private ArrayList<Double> examScores;

    public Student(String firstName, String lastName, Double[] testScores) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.examScores = new ArrayList<Double>(Arrays.asList(testScores));
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public ArrayList<Double> getExamScoresDouble() {
        ArrayList<Double> scores = new ArrayList<>();
        for(Double results : examScores)    {
            scores.add(results);
        }   return scores;
    }

    public Integer getNumberOfExamsTaken() {
        return examScores.size();
    }

    public String getExamScores() {
        Integer examNum = 1;
        int i = 1;
        String stringExamScores = "Exam Scores:\n";
        for (i = 0; i < examScores.size(); i++) {
            stringExamScores += String.format("\tExam %d -> %d\n", i + 1, (int) Math.round(this.examScores.get(i)));
        }
        System.out.println(stringExamScores);
        return stringExamScores;
    }

    public void addExamScore(Double examScore) {
        this.examScores.add(examScore);
    }

    public void setExamScores(int examIndex, double exam) {
        examScores.set(examIndex, exam);
    }

    public double getAverageExamScore() {
        double sum = 0;
        for (Double value : examScores) {
            sum += value;
        }
        return Math.round(sum / this.examScores.size());
    }


    public String toString() {

        return String.format("Student Name: %s %s\n> Average Score: %d\n> ", this.firstName, this.lastName, Math.round(this.getAverageExamScore())) + this.getExamScores();


    }




}
