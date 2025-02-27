package io.zipcoder;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;

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

    //Remove Student
    public void removeStudent(String firstName, String lastName) {
        for (int i = 0; i < this.students.length; i++) {
            if (this.students[i].getFirstName() == firstName && this.students[i].getLastName() == lastName) {
                Student temp = this.students[i];
                for (int j = i; j < this.students.length - 1; j++) {
                    this.students[j] = this.students[j + 1];
                }
            }
            this.students[this.students.length - 1] = null;
            break;
        }
    }


    public Student[] getStudentsByScore() {
        sortByDescendingAvgExamScore();
        for (int i = 0; i < students.length; i++) {
            if (students[i] == students[i + 1]) {
                sortByName();
            }
        }
        return students;
    }

    public Student[] sortByDescendingAvgExamScore()   {
        Arrays.sort(students, new StudentAvgExamSorter());
        return students;
    }

    public Student[] sortByName()   {
        Arrays.sort(students, new StudentNameSorter());
        return students;

    }

    public HashMap<Student, String> getGradeBook()  {
        HashMap studentsMap = new HashMap();

        for(int i = 0; i < students.length; i++)   {
            if(students[i].getAverageExamScore() >= getClassAverageExamScore() * .9)   {
                studentsMap.put(students[i].getLastName(), "A");
            }   if(students[i].getAverageExamScore() >= getClassAverageExamScore() * .8) {
                studentsMap.put(students[i].getLastName(), "B");
            }   if(students[i].getAverageExamScore() >= getClassAverageExamScore() * .5) {
                studentsMap.put(students[i].getLastName(), "B");
            }   if(students[i].getAverageExamScore() >= getClassAverageExamScore() * .11) {
                studentsMap.put(students[i].getLastName(), "B");
            }   else    {
                studentsMap.put(students[i].getLastName(), "F");
            }
        }
        return studentsMap;
    }




}
