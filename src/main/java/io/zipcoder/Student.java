package io.zipcoder;

import java.util.ArrayList;

public class Student {


    private String firstName;
    private String lastName;
    private ArrayList<Double> examScores = new ArrayList<>();

    public Student(String firstName, String lastName, ArrayList<Double> examScores) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.examScores = examScores;
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

    public ArrayList<Double> getExamScores() {
        return examScores;
    }

    public Integer getNumberOfExamsTaken()  {
        return examScores.size();
    }


}
