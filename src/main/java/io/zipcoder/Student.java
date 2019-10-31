package io.zipcoder;

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

    public ArrayList<Double> getExamScores(ArrayList<Double> examScores) {
        return examScores;
    }

    public Integer getNumberOfExamsTaken()  {
        return examScores.size();
    }

    public String getExamScores()   {
        Integer examNum = 1;
        int i = 1;
        String stringExamScores = "Exam Scores:\n";
        for (i = 1; i < examScores.size(); i++) {
             stringExamScores += String.format("\tExam %d -> %d\n", i, (int)Math.rint(this.examScores.get(i)));
        }
        System.out.println(stringExamScores);
        return stringExamScores;
    }

    public void addExamScore(Double examScore) {
        this.examScores.add(examScore);
    }

    public void setExamScores(int examIndex, double exam)   {
        examScores.add(examIndex, exam);
    }


}
