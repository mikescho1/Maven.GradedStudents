package io.zipcoder;

import junitparams.JUnitParamsRunner;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;

import java.util.Map;
@RunWith(JUnitParamsRunner.class)
public class ClassroomTest {

    private Student student1;
    private Student student2;
    private Student student3;
    private Student student4;
    private Student student5;


    @Before
    public void setUp()  {

    }



    @Test
    public void getStudentsTest()   {
        Classroom classroom = new Classroom();
        Student[] students = classroom.getStudents();
        int expected = 30;
        int actual = students.length;
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void getStudentsTest2()    {
        Classroom classroom = new Classroom(20);
        Student[] students = classroom.getStudents();
        int expected = 20;
        int actual = students.length;
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void getStudentsTest3()   {
        Classroom classroomScience = new Classroom(new Student[]{student1, student2, student3, student4}); //unnamed group/array of students in science classroom.
        Student[] smartKids = classroomScience.getStudents(); //students in science classroom are now named smartkids.
        int expected = 4;
        int actual = smartKids.length; // tells us how many smart kids are in science classroom.
        Assert.assertEquals(expected, actual);
    }



    @Test
    public void getClassAverageExamScore()   {
        Student student1 = new Student("Adam", "Scho", new Double[]{100.0, 100.0, 100.0});
        Student student2 = new Student("Bill", "Smith", new Double[]{99.3, 75.9, 88.0});
        Student student3 = new Student("Sean", "Dab", new Double[]{94.0, 81.4, 100.0});
        Student student4 = new Student("Alice", "Kite", new Double[]{100.0, 99.3, 99.1});
        Student student5 = new Student("Suzie", "Echo", new Double[]{96.5, 98.3, 100.0});

        Classroom classroomHistory = new Classroom(new Student[] {student4, student3});
        Student [] students = classroomHistory.getStudents();

        double expected = 95.6;
        double actual = classroomHistory.getClassAverageExamScore();
        Assert.assertEquals(expected, actual, 0.05);
    }

    @Test
    public void addStudentTest()    {
        int maxNumberOfStudents = 10;
        Classroom classroomMusic = new Classroom(maxNumberOfStudents); //constructor;
        classroomMusic.addStudent(student3);
        classroomMusic.addStudent(student1);
        Student[] musicStudents = classroomMusic.getStudents();

        Student expectedStudent = student1;
        Student actualStudent = musicStudents[11];
        int expectedInt = 12;
        int actualInt = musicStudents.length;

        Assert.assertEquals(expectedStudent, actualStudent);
        Assert.assertEquals(expectedInt, actualInt);
    }

    @Test
    public void removeStudentTest() {
        Student student1 = new Student("Adam", "Scho", new Double[]{100.0, 100.0, 100.0});
        Student student2 = new Student("Bill", "Smith", new Double[]{99.3, 75.9, 88.0});
        Student student3 = new Student("Sean", "Dab", new Double[]{94.0, 81.4, 100.0});
        Student student4 = new Student("Alice", "Kite", new Double[]{100.0, 99.3, 99.1});
        Student student5 = new Student("Suzie", "Echo", new Double[]{96.5, 98.3, 100.0});
        Classroom classroomSocialStudies = new Classroom(new Student[] {student2,});
        Student [] studentList = classroomSocialStudies.getStudents();
        classroomSocialStudies.removeStudent(student2.getFirstName(), student2.getLastName());
        Student expectedStudent = null;
        Student actualStudent = studentList[0];
        int expectedInt = 1;
        int actualInt = classroomSocialStudies.getStudents().length;
        Assert.assertEquals(expectedStudent, actualStudent);
        Assert.assertEquals(expectedInt, actualInt);

    }









































}
