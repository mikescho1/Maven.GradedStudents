package io.zipcoder;

public class Classroom {
    private Student[] students;
    private int maxNumberOfStudents;


    Classroom (int maxNumberOfStudents) {
        this.maxNumberOfStudents = maxNumberOfStudents;
    }

    Classroom (int maxNumberOfStudents, Student [] students)    {
        this.maxNumberOfStudents = maxNumberOfStudents;
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
