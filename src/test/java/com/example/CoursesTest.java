/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Craig
 */
public class CoursesTest {
    
    public CoursesTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of getStrSupp method, of class Courses.
     */
    @Test
    public void testGetStrSupp() {
        System.out.println("getStrSupp");
        Courses instance = null;
        String expResult = "";
        String result = instance.getStrSupp();
        assertEquals(expResult, result);
    }

    /**
     * Test of setStrSupp method, of class Courses.
     */
    @Test
    public void testSetStrSupp() {
        System.out.println("setStrSupp");
        String strSupp = "";
        Courses instance = null;
        instance.setStrSupp(strSupp);
    }

    /**
     * Test of getCourseOutcome method, of class Courses.
     */
    @Test
    public void testGetCourseOutcome() {
        System.out.println("getCourseOutcome");
        Courses instance = null;
        String expResult = "";
        String result = instance.getCourseOutcome();
        assertEquals(expResult, result);
    }

    /**
     * Test of setCourseOutcome method, of class Courses.
     */
    @Test
    public void testSetCourseOutcome() {
        System.out.println("setCourseOutcome");
        String courseOutcome = "";
        Courses instance = null;
        instance.setCourseOutcome(courseOutcome);
    }

    /**
     * Test of getFinalMark method, of class Courses.
     */
    @Test
    public void testGetFinalMark() {
        System.out.println("getFinalMark");
        Courses instance = null;
        double expResult = 0.0;
        double result = instance.getFinalMark();
        assertEquals(expResult, result, 0.0);
    }

    /**
     * Test of setFinalMark method, of class Courses.
     */
    @Test
    public void testSetFinalMark() {
        System.out.println("setFinalMark");
        double finalMark = 0.0;
        Courses instance = null;
        instance.setFinalMark(finalMark);
    }

    /**
     * Test of getCourseName method, of class Courses.
     */
    @Test
    public void testGetCourseName() {
        System.out.println("getCourseName");
        Courses instance = null;
        String expResult = "";
        String result = instance.getCourseName();
        assertEquals(expResult, result);
    }

    /**
     * Test of setCourseName method, of class Courses.
     */
    @Test
    public void testSetCourseName() {
        System.out.println("setCourseName");
        String courseName = "";
        Courses instance = null;
        instance.setCourseName(courseName);
    }

    /**
     * Test of getYear method, of class Courses.
     */
    @Test
    public void testGetYear() {
        System.out.println("getYear");
        Courses instance = null;
        int expResult = 0;
        int result = instance.getYear();
        assertEquals(expResult, result);
    }

    /**
     * Test of setYear method, of class Courses.
     */
    @Test
    public void testSetYear() {
        System.out.println("setYear");
        int year = 0;
        Courses instance = null;
        instance.setYear(year);
    }

    /**
     * Test of getCourseCode method, of class Courses.
     */
    @Test
    public void testGetCourseCode() {
        System.out.println("getCourseCode");
        Courses instance = null;
        String expResult = "";
        String result = instance.getCourseCode();
        assertEquals(expResult, result);
    }

    /**
     * Test of setCourseCode method, of class Courses.
     */
    @Test
    public void testSetCourseCode() {
        System.out.println("setCourseCode");
        String courseCode = "";
        Courses instance = null;
        instance.setCourseCode(courseCode);
    }

    /**
     * Test of getCredits method, of class Courses.
     */
    @Test
    public void testGetCredits() {
        System.out.println("getCredits");
        Courses instance = null;
        int expResult = 0;
        int result = instance.getCredits();
        assertEquals(expResult, result);
    }

    /**
     * Test of setCredits method, of class Courses.
     */
    @Test
    public void testSetCredits() {
        System.out.println("setCredits");
        int credits = 0;
        Courses instance = null;
        instance.setCredits(credits);
    }

    /**
     * Test of getSuppMark method, of class Courses.
     */
    @Test
    public void testGetSuppMark() {
        System.out.println("getSuppMark");
        Courses instance = null;
        double expResult = 0.0;
        double result = instance.getSuppMark();
        assertEquals(expResult, result, 0.0);
    }

    /**
     * Test of setSuppMark method, of class Courses.
     */
    @Test
    public void testSetSuppMark() {
        System.out.println("setSuppMark");
        double suppMark = 0.0;
        Courses instance = null;
        instance.setSuppMark(suppMark);
    }
    
}
