/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package de.htw_berlin.aStudent.model;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Eredrian
 */
public class TopicTest {
    
    public TopicTest() {
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
     * Test of getTopicId method, of class Topic.
     */
    @Test
    public void testGetTopicId() {
        System.out.println("getTopicId");
        Topic instance = new Topic();
        Long expResult = null;
        Long result = instance.getTopicId();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getTopicName method, of class Topic.
     */
    @Test
    public void testGetTopicName() {
        System.out.println("getTopicName");
        Topic instance = new Topic();
        String expResult = "";
        String result = instance.getTopicName();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getUser method, of class Topic.
     */
    @Test
    public void testGetUser() {
        System.out.println("getUser");
        Topic instance = new Topic();
        UserE expResult = null;
        UserE result = instance.getUser();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of hashCode method, of class Topic.
     */
    @Test
    public void testHashCode() {
        System.out.println("hashCode");
        Topic instance = new Topic();
        int expResult = 0;
        int result = instance.hashCode();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of equals method, of class Topic.
     */
    @Test
    public void testEquals() {
        System.out.println("equals");
        Object obj = null;
        Topic instance = new Topic();
        boolean expResult = false;
        boolean result = instance.equals(obj);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
