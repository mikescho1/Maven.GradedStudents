package io.zipcoder;

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

    public double getAverageExamScore(double[]examScores) {
        double avgExamScore = 0;

        for (int i = 0; i < examScores.length; i++) {
            avgExamScore += examScores[i];
        }   return avgExamScore / students.length;

}









}
