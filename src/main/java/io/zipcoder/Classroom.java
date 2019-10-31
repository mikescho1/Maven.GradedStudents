package io.zipcoder;

public class Classroom {
    Student[] students;
    int maxNumberOfStudents;


    Classroom (int maxNumberOfStudents) {
        this.maxNumberOfStudents = maxNumberOfStudents;
    }

    Classroom (int maxNumberOfStudents, Student [] students)    {
        this.maxNumberOfStudents = maxNumberOfStudents;
        this.students = students;
    }

    Classroom ()    {
        Student[] student = new Student [30];
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
