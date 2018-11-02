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
public class StudentHistoryTest {
    
    public StudentHistoryTest() {
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
     * Test of getYear method, of class StudentHistory.
     */
    @org.junit.Test
    public void testGetYear() {
        System.out.println("getYear");
        StudentHistory instance = null;
        int expResult = 0;
        int result = instance.getYear();
        assertEquals(expResult, result);
    }

    /**
     * Test of setYear method, of class StudentHistory.
     */
    @org.junit.Test
    public void testSetYear() {
        System.out.println("setYear");
        int year = 0;
        StudentHistory instance = null;
        instance.setYear(year);
    }

    /**
     * Test of getYos method, of class StudentHistory.
     */
    @org.junit.Test
    public void testGetYos() {
        System.out.println("getYos");
        StudentHistory instance = null;
        String expResult = "";
        String result = instance.getYos();
        assertEquals(expResult, result);
    }

    /**
     * Test of setYos method, of class StudentHistory.
     */
    @org.junit.Test
    public void testSetYos() {
        System.out.println("setYos");
        String yos = "";
        StudentHistory instance = null;
        instance.setYos(yos);
    }

    /**
     * Test of getProgramCode method, of class StudentHistory.
     */
    @org.junit.Test
    public void testGetProgramCode() {
        System.out.println("getProgramCode");
        StudentHistory instance = null;
        String expResult = "";
        String result = instance.getProgramCode();
        assertEquals(expResult, result);
    }

    /**
     * Test of setProgramCode method, of class StudentHistory.
     */
    @org.junit.Test
    public void testSetProgramCode() {
        System.out.println("setProgramCode");
        String programCode = "";
        StudentHistory instance = null;
        instance.setProgramCode(programCode);
    }

    /**
     * Test of getYearOutcome method, of class StudentHistory.
     */
    @org.junit.Test
    public void testGetYearOutcome() {
        System.out.println("getYearOutcome");
        StudentHistory instance = null;
        String expResult = "";
        String result = instance.getYearOutcome();
        assertEquals(expResult, result);
    }

    /**
     * Test of setYearOutcome method, of class StudentHistory.
     */
    @org.junit.Test
    public void testSetYearOutcome() {
        System.out.println("setYearOutcome");
        String yearOutcome = "";
        StudentHistory instance = null;
        instance.setYearOutcome(yearOutcome);
    }

    /**
     * Test of getOutcomeDescription method, of class StudentHistory.
     */
    @org.junit.Test
    public void testGetOutcomeDescription() {
        System.out.println("getOutcomeDescription");
        StudentHistory instance = null;
        String expResult = "";
        String result = instance.getOutcomeDescription();
        assertEquals(expResult, result);
    }

    /**
     * Test of setOutcomeDescription method, of class StudentHistory.
     */
    @org.junit.Test
    public void testSetOutcomeDescription() {
        System.out.println("setOutcomeDescription");
        String outcomeDescription = "";
        StudentHistory instance = null;
        instance.setOutcomeDescription(outcomeDescription);
    }

    /**
     * Test of getAverageMarks method, of class StudentHistory.
     */
    @org.junit.Test
    public void testGetAverageMarks() {
        System.out.println("getAverageMarks");
        StudentHistory instance = null;
        double expResult = 0.0;
        double result = instance.getAverageMarks();
        assertEquals(expResult, result, 0.0);
    }

    /**
     * Test of setAverageMarks method, of class StudentHistory.
     */
    @org.junit.Test
    public void testSetAverageMarks() {
        System.out.println("setAverageMarks");
        double averageMarks = 0.0;
        StudentHistory instance = null;
        instance.setAverageMarks(averageMarks);
    }

    /**
     * Test of getEnrolledCredits method, of class StudentHistory.
     */
    @org.junit.Test
    public void testGetEnrolledCredits() {
        System.out.println("getEnrolledCredits");
        StudentHistory instance = null;
        int expResult = 0;
        int result = instance.getEnrolledCredits();
        assertEquals(expResult, result);
    }

    /**
     * Test of setEnrolledCredits method, of class StudentHistory.
     */
    @org.junit.Test
    public void testSetEnrolledCredits() {
        System.out.println("setEnrolledCredits");
        int enrolledCredits = 0;
        StudentHistory instance = null;
        instance.setEnrolledCredits(enrolledCredits);
    }

    /**
     * Test of getAchievedCredits method, of class StudentHistory.
     */
    @org.junit.Test
    public void testGetAchievedCredits() {
        System.out.println("getAchievedCredits");
        StudentHistory instance = null;
        int expResult = 0;
        int result = instance.getAchievedCredits();
        assertEquals(expResult, result);
    }

    /**
     * Test of setAchievedCredits method, of class StudentHistory.
     */
    @org.junit.Test
    public void testSetAchievedCredits() {
        System.out.println("setAchievedCredits");
        int achievedCredits = 0;
        StudentHistory instance = null;
        instance.setAchievedCredits(achievedCredits);
    }
    
}
