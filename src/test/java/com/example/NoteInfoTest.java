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
public class NoteInfoTest {
    
    public NoteInfoTest() {
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
     * Test of getNotePriv method, of class NoteInfo.
     */
    @Test
    public void testGetNotePriv() {
        System.out.println("getNotePriv");
        NoteInfo instance = null;
        String expResult = "";
        String result = instance.getNotePriv();
        assertEquals(expResult, result);
    }

    /**
     * Test of setNotePriv method, of class NoteInfo.
     */
    @Test
    public void testSetNotePriv() {
        System.out.println("setNotePriv");
        String notePriv = "";
        NoteInfo instance = null;
        instance.setNotePriv(notePriv);
    }

    /**
     * Test of getNotePub method, of class NoteInfo.
     */
    @Test
    public void testGetNotePub() {
        System.out.println("getNotePub");
        NoteInfo instance = null;
        String expResult = "";
        String result = instance.getNotePub();
        assertEquals(expResult, result);
    }

    /**
     * Test of setNotePub method, of class NoteInfo.
     */
    @Test
    public void testSetNotePub() {
        System.out.println("setNotePub");
        String notePub = "";
        NoteInfo instance = null;
        instance.setNotePub(notePub);
    }

    /**
     * Test of getUser method, of class NoteInfo.
     */
    @Test
    public void testGetUser() {
        System.out.println("getUser");
        NoteInfo instance = null;
        String expResult = "";
        String result = instance.getUser();
        assertEquals(expResult, result);
    }

    /**
     * Test of setUser method, of class NoteInfo.
     */
    @Test
    public void testSetUser() {
        System.out.println("setUser");
        String user = "";
        NoteInfo instance = null;
        instance.setUser(user);
    }

    /**
     * Test of getUserInfo method, of class NoteInfo.
     */
    @Test
    public void testGetUserInfo() {
        System.out.println("getUserInfo");
        String username = "";
        NoteInfo instance = null;
        String expResult = "";
        String result = instance.getUserInfo(username);
        assertEquals(expResult, result);
    }
    
}
