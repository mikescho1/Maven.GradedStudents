package io.zipcoder;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class ClassroomTest {


    @Before
    public void setUp() {}

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

}
