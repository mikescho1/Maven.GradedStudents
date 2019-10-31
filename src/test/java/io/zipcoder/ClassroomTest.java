package io.zipcoder;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class ClassroomTest {
    private Classroom classroom1;
    private Student student1;
    private Student student2;
    private Student student3;
    private Student student4;
    private Student student5;


    @Before
    public void setUp() {
        student1 = new Student("Adam", "Scho", new Double[]{100.0, 100.0, 100.0});
        student2 = new Student("Bill", "Smith", new Double[]{99.3, 75.9, 88.0});
        student3 = new Student("Sean", "Dab", new Double[]{94.0, 81.4, 100.0});
        student4 = new Student("Alice", "Kite", new Double[]{100.0, 99.3, 99.1});
        student5 = new Student("Suzie", "Echo", new Double[]{96.5, 98.3, 100.0});
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
    public void getStudentsTest3()  {
        student1 = New Student("Adam", "Scho", new Double[] {99, 98, 97});
        Classroom classroom = new Classroom(new Student[] {student1, student2, student3, student4, student5});

        int expected
    }


    @Test
    public void getAverageExamScoreTest()   {
        Classroom classroom = new Classroom();



    }

}
