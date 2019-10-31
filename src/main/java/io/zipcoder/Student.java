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

        String examList = "";
        Integer examNum = 0;
        for (int i = 0; i < examScores.size(); i++) {
            examList = "Exam " + examNum + "-> " + examScores.get(i).toString();
            examNum++;


            
        }

        return null;
    }
}
