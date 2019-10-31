package io.zipcoder;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.Map;

public class ClassroomTest {

    private Student student1;
    private Student student2;
    private Student student3;
    private Student student4;
    private Student student5;


    @Before
    public void setUp() throws Exception {
        Student student1 = new Student("Adam", "Scho", new Double[]{100.0, 100.0, 100.0});
        Student student2 = new Student("Bill", "Smith", new Double[]{99.3, 75.9, 88.0});
        Student student3 = new Student("Sean", "Dab", new Double[]{94.0, 81.4, 100.0});
        Student student4 = new Student("Alice", "Kite", new Double[]{100.0, 99.3, 99.1});
        Student student5 = new Student("Suzie", "Echo", new Double[]{96.5, 98.3, 100.0});
    }

    @After
    public void tearDown()  {}

    @Test
    public void getStudentsTest()   {
        Classroom classroom = new Classroom();
        Student students [] = classroom.getStudents();
        int expected = 30;
        int actual = students.length;
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void getStudentsTest2()    {
        Classroom classroom = new Classroom(20);
        Student students [] = classroom.getStudents();
        int expected = 20;
        int actual = students.length;
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void getStudentsTest3()   {
        Classroom classroomScience = new Classroom(new Student[]{student1, student2, student3, student4}); //unnamed group/array of students in science classroom.
        Student smartKids [] = classroomScience.getStudents(); //students in science classroom are now named smartkids.
        int expected = 4;
        int actual = smartKids.length; // tells us how many smart kids are in science classroom.
        Assert.assertEquals(expected, actual);
    }



    @Test
    public void getAverageExamScore()   {
        Classroom classroomHistory = new Classroom((new Student[] {student4, student3}));
        Student dumbkids [] = classroomHistory.getStudents();
        double expected = 98.9;
        double actual =

    }




}
