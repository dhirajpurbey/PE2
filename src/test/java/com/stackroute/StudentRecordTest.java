package com.stackroute;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;import static org.junit.Assert.*;public class StudentRecordTest2 {
    private StudentRecord studentrecord;    @After
    public void startInitial() throws Exception {
        studentrecord=null;
    }    @Test
    public void testValue()
    {
        studentrecord=new StudentRecord(3);
        int arr[] = {40,50,60};
        studentrecord.getValue(arr);
        assertEquals(50.0,studentrecord.getAvg(),2);
        assertEquals(40,studentrecord.getMin());
        assertEquals(60,studentrecord.getMax());
    }    @Test
    public void testValue1()
    {
        studentrecord=new StudentRecord(7);
        int arr[] = {11,22,33,44,55,66,77};
        studentrecord.getValue(arr);
        assertEquals(44.0,studentrecord.getAvg(),2);
        assertEquals(11,studentrecord.getMin());
        assertEquals(77,studentrecord.getMax());
    }}