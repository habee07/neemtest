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
public class CGridLayoutTest {
    
    public CGridLayoutTest() {
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
     * Test of getCGrid method, of class CGridLayout.
     */
    @Test
    public void testGetCGrid() {
        System.out.println("getCGrid");
        CGridLayout instance = null;
        CourseGrid expResult = null;
        CourseGrid result = instance.getCGrid();
        assertEquals(expResult, result);
    }

    /**
     * Test of setCGrid method, of class CGridLayout.
     */
    @Test
    public void testSetCGrid() {
        System.out.println("setCGrid");
        CourseGrid CGrid = null;
        CGridLayout instance = null;
        instance.setCGrid(CGrid);
    }

    /**
     * Test of getAstudent method, of class CGridLayout.
     */
    @Test
    public void testGetAstudent() {
        System.out.println("getAstudent");
        CGridLayout instance = null;
        students expResult = null;
        students result = instance.getAstudent();
        assertEquals(expResult, result);
    }

    /**
     * Test of setAstudent method, of class CGridLayout.
     */
    @Test
    public void testSetAstudent() {
        System.out.println("setAstudent");
        students astudent = null;
        CGridLayout instance = null;
        instance.setAstudent(astudent);
    }

    /**
     * Test of getFilterList method, of class CGridLayout.
     */
    @Test
    public void testGetFilterList() {
        System.out.println("getFilterList");
        CGridLayout instance = null;
        List<String> expResult = null;
        List<String> result = instance.getFilterList();
        assertEquals(expResult, result);
    }

    /**
     * Test of setFilterList method, of class CGridLayout.
     */
    @Test
    public void testSetFilterList() {
        System.out.println("setFilterList");
        List<String> filterList = null;
        CGridLayout instance = null;
        instance.setFilterList(filterList);
    }

    /**
     * Test of getFilterType method, of class CGridLayout.
     */
    @Test
    public void testGetFilterType() {
        System.out.println("getFilterType");
        CGridLayout instance = null;
        String expResult = "";
        String result = instance.getFilterType();
        assertEquals(expResult, result);
    }

    /**
     * Test of setFilterType method, of class CGridLayout.
     */
    @Test
    public void testSetFilterType() {
        System.out.println("setFilterType");
        String filterType = "";
        CGridLayout instance = null;
        instance.setFilterType(filterType);
    }

    /**
     * Test of getStudentDetails method, of class CGridLayout.
     */
    @Test
    public void testGetStudentDetails() {
        System.out.println("getStudentDetails");
        CGridLayout instance = null;
        StudentDetails expResult = null;
        StudentDetails result = instance.getStudentDetails();
        assertEquals(expResult, result);
    }

    /**
     * Test of setStudentDetails method, of class CGridLayout.
     */
    @Test
    public void testSetStudentDetails() {
        System.out.println("setStudentDetails");
        StudentDetails studentDetails = null;
        CGridLayout instance = null;
        instance.setStudentDetails(studentDetails);
    }

    /**
     * Test of getStudentYearInfo method, of class CGridLayout.
     */
    @Test
    public void testGetStudentYearInfo() {
        System.out.println("getStudentYearInfo");
        CGridLayout instance = null;
        StudentYearInfo expResult = null;
        StudentYearInfo result = instance.getStudentYearInfo();
        assertEquals(expResult, result);
    }

    /**
     * Test of setStudentYearInfo method, of class CGridLayout.
     */
    @Test
    public void testSetStudentYearInfo() {
        System.out.println("setStudentYearInfo");
        StudentYearInfo studentYearInfo = null;
        CGridLayout instance = null;
        instance.setStudentYearInfo(studentYearInfo);
    }
    
}
