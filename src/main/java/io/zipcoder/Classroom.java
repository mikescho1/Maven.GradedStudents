package io.zipcoder;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class Classroom {
    private Student[] students;         // this is an array of students.
    private int maxNumberOfStudents; //this represents the max length of the students array.

    Classroom() {
        this.students = new Student[30];
    }

    Classroom(int maxNumberOfStudents) {
        this.students = new Student[maxNumberOfStudents];
    }

    Classroom(Student[] students) {
        this.students = students;
    }


    public Student[] getStudents() {
        return students;
    }

    public double getClassAverageExamScore() {
        Integer counter = 0;
        double sum = 0.0;
        for (Student student : students) {
            for (double score : student.getListOfScores()) {
                sum += score;
            }
            counter += student.getNumberOfExamsTaken();
        }
        return sum / counter;
    }

    public void addStudent(Student student) {
        Student[] students2 = new Student[students.length + 1];
        students2[this.students.length] = student;
        students = students2;
    }


    public void removeStudent(String firstName, String lastName) {
        Student[] students1 = new Student[students.length - 1];
        int identifier = 0;
        for (int i = 0; i < students.length; i++) {
            if (students[i].getFirstName().equals(firstName) && students[i].getLastName().equals(lastName)) {
                identifier = i;
            }
        }
        for (int i = 0; i < students1.length; i++) {
            if (i < identifier) {
                students1[i] = students[i];
            }
            if (i > identifier) {
                students[i - 1] = students[i];

            }
        }
    }
}
