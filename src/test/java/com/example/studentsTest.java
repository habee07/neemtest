/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example;

import java.util.List;
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
public class studentsTest {
    
    public studentsTest() {
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
     * Test of getHistory method, of class students.
     */
    @org.junit.Test
    public void testGetHistory() {
        System.out.println("getHistory");
        students instance = null;
        List<StudentHistory> expResult = null;
        List<StudentHistory> result = instance.getHistory();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of setHistory method, of class students.
     */
    @org.junit.Test
    public void testSetHistory() {
        System.out.println("setHistory");
        List<StudentHistory> history = null;
        students instance = null;
        instance.setHistory(history);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getStudentNumber method, of class students.
     */
    @org.junit.Test
    public void testGetStudentNumber() {
        System.out.println("getStudentNumber");
        students instance = null;
        String expResult = "";
        String result = instance.getStudentNumber();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of setStudentNumber method, of class students.
     */
    @org.junit.Test
    public void testSetStudentNumber() {
        System.out.println("setStudentNumber");
        String studentNumber = "";
        students instance = null;
        instance.setStudentNumber(studentNumber);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getStudentSurname method, of class students.
     */
    @org.junit.Test
    public void testGetStudentSurname() {
        System.out.println("getStudentSurname");
        students instance = null;
        String expResult = "";
        String result = instance.getStudentSurname();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of setStudentSurname method, of class students.
     */
    @org.junit.Test
    public void testSetStudentSurname() {
        System.out.println("setStudentSurname");
        String studentSurname = "";
        students instance = null;
        instance.setStudentSurname(studentSurname);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getStudentName method, of class students.
     */
    @org.junit.Test
    public void testGetStudentName() {
        System.out.println("getStudentName");
        students instance = null;
        String expResult = "";
        String result = instance.getStudentName();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of setStudentName method, of class students.
     */
    @org.junit.Test
    public void testSetStudentName() {
        System.out.println("setStudentName");
        String studentName = "";
        students instance = null;
        instance.setStudentName(studentName);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getProgram method, of class students.
     */
    @org.junit.Test
    public void testGetProgram() {
        System.out.println("getProgram");
        students instance = null;
        String expResult = "";
        String result = instance.getProgram();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of setProgram method, of class students.
     */
    @org.junit.Test
    public void testSetProgram() {
        System.out.println("setProgram");
        String program = "";
        students instance = null;
        instance.setProgram(program);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getCourse method, of class students.
     */
    @org.junit.Test
    public void testGetCourse() {
        System.out.println("getCourse");
        students instance = null;
        List<Courses> expResult = null;
        List<Courses> result = instance.getCourse();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of setCourse method, of class students.
     */
    @org.junit.Test
    public void testSetCourse() {
        System.out.println("setCourse");
        List<Courses> course = null;
        students instance = null;
        instance.setCourse(course);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getStNotes method, of class students.
     */
    @org.junit.Test
    public void testGetStNotes() {
        System.out.println("getStNotes");
        students instance = null;
        List<NoteInfo> expResult = null;
        List<NoteInfo> result = instance.getStNotes();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of setStNotes method, of class students.
     */
    @org.junit.Test
    public void testSetStNotes() {
        System.out.println("setStNotes");
        List<NoteInfo> stNotes = null;
        students instance = null;
        instance.setStNotes(stNotes);
    }
    
}
