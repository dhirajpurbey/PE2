package com.stackroute;

/*
Write a program, which reads number of students and n grades as input (of int between 0 and 100, inclusive)
and displays the average, minimum and maximum.Your program shall check for valid input.
You should keep all the grades in an int[] and use a method for each of the computations.

 Output:

Enter the number of students: 4
Enter the grade for student 1: 86
Enter the grade for student 2: 65
Enter the grade for student 3: 98
Enter the grade for student 4: 77

The average is 81.50
The minimum is 65
The maximum is 98
*/

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class AverageMinimumMaximumTest {
    private AverageMinimumMaximum obj;

   /* @Before
    public void setUp() throws Exception {
        obj = new AverageMinimumMaximum(int n);
    }*/

    @After
    public void tearDown() throws Exception {
        obj = null;
    }

    @Test
    public void testResults() {
        obj = new AverageMinimumMaximum(4);
        obj.getData(54,23,98,56);
        assertEquals(57.75, obj.avg());
        assertEquals(23, obj.min());
        assertEquals(98, obj.max());
    }

    @Test
    public void testInput() {
        obj = new AverageMinimumMaximum(10);
        obj.getData(54,23,98,56,65,34,65,34,35,666);
        assertEquals("Invalid Input", obj.err());
    }

    @Test
    public void testInput() {
        obj = new AverageMinimumMaximum(10);
        obj.getData(-54,45,23,21,43,23,42,34,455);
        assertEquals("Invalid Input", obj.err());
    }

    @Test
    public void testResults1() {
        obj = new AverageMinimumMaximum(6);
        obj.getData(54,23,98,56,45,23);
        assertEquals(74.75, obj.avg());
        assertEquals(23, obj.min());
        assertEquals(98, obj.max());
    }

}