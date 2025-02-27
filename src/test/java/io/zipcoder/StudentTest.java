package io.zipcoder;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.sql.Struct;
import java.util.ArrayList;
import java.util.Arrays;

public class StudentTest {



    @Before
    public void setUp() {

    }

    @After
    public void tearDown()  {

    }


    @Test
    public void getFirstNameTest() {
       Student student1 = new Student("Mike", "Scho", new Double[] {99.0, 98.8, 97.6, 96.5});
       String expected = "Mike";
       String actual = student1.getFirstName();
       Assert.assertEquals(expected,actual);
    }

    @Test
    public void getLastNameTest()   {
        Student student3 = new Student("Bill", "Smith", new Double[] {99.0, 98.8, 97.6, 96.5});
        String expected = "Smith";
        String actual = student3.getLastName();
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void setFirstNameTest()  {
        Student student2 = new Student("Frank", "Hart", new Double[] {99.0, 98.8, 97.6, 96.5});
        String expected = "Dave";
        student2.setFirstName("Dave");
        String actual = student2.getFirstName();
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void setLastNameTest()   {
        Student student = new Student("Frank", "Hart", new Double[] {99.0, 98.8, 97.6, 96.5});
        String expected = "Thomas";
        student.setLastName("Thomas");
        String actual = student.getLastName();
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void getExamScoresTest() {
        Student student = new Student("Frank", "Hart", new Double[] {99.0, 98.8, 97.6, 96.4});
        String expected = "Exam Scores:\n" +
                "\tExam 1 -> 99\n" +
                "\tExam 2 -> 99\n" +
                "\tExam 3 -> 98\n" +
                "\tExam 4 -> 96\n";
        String actual = student.getExamScores();
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void addExamScoreTest()  {
        Student student = new Student("Frank", "Hart", new Double[] {});
        student.addExamScore(100.0);
        String expected = "Exam Scores:\n" +
                "\tExam 1 -> 100\n";
        String actual = student.getExamScores();
        Assert.assertEquals(expected, actual);
    }
    @Test
    public void setExamScoreTest()  {
        Student student = new Student("Frank", "Hart", new Double[] {40.0, 99.9});
        student.setExamScores(0, 97.6);
        String expected = "Exam Scores:\n" +
                "\tExam 1 -> 98\n" +
                "\tExam 2 -> 100\n";
        String actual = student.getExamScores();
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void getAverageExamScoreTest()   {
        Student student = new Student("Frank", "Hart", new Double[] {40.0, 99.9});
        double expected = Math.round((40.0 + 100.0) / 2);
        double actual = student.getAverageExamScore();
        Assert.assertEquals(expected, actual, .01);
    }

    @Test
    public void toStringTest()  {
        Student student = new Student("Frank", "Hart", new Double[] {40.0, 99.9});
        String expected = "Student Name: Frank Hart\n" +
                "> Average Score: 70\n" +
                "> Exam Scores:\n" +
                "\tExam 1 -> 40\n" +
                "\tExam 2 -> 100\n";
        String actual = student.toString();
        System.out.println(student.toString());
        Assert.assertEquals(expected, actual);
    }



}