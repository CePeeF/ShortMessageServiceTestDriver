/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package de.htw_berlin.aStudent.model;

import java.util.Date;
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
public class MessageETest {
    
    public MessageETest() {
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
     * Test of getMessageId method, of class MessageE.
     */
    @Test
    public void testGetMessageId() {
        System.out.println("getMessageId");
        MessageE instance = new MessageE();
        Long expResult = null;
        Long result = instance.getMessageId();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getOrigin method, of class MessageE.
     */
    @Test
    public void testGetOrigin() {
        System.out.println("getOrigin");
        MessageE instance = new MessageE();
        Boolean expResult = null;
        Boolean result = instance.getOrigin();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getUser method, of class MessageE.
     */
    @Test
    public void testGetUser() {
        System.out.println("getUser");
        MessageE instance = new MessageE();
        UserE expResult = null;
        UserE result = instance.getUser();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getTopic method, of class MessageE.
     */
    @Test
    public void testGetTopic() {
        System.out.println("getTopic");
        MessageE instance = new MessageE();
        Topic expResult = null;
        Topic result = instance.getTopic();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getContent method, of class MessageE.
     */
    @Test
    public void testGetContent() {
        System.out.println("getContent");
        MessageE instance = new MessageE();
        String expResult = "";
        String result = instance.getContent();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getDate method, of class MessageE.
     */
    @Test
    public void testGetDate() {
        System.out.println("getDate");
        MessageE instance = new MessageE();
        Date expResult = null;
        Date result = instance.getDate();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of hashCode method, of class MessageE.
     */
    @Test
    public void testHashCode() {
        System.out.println("hashCode");
        MessageE instance = new MessageE();
        int expResult = 0;
        int result = instance.hashCode();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of equals method, of class MessageE.
     */
    @Test
    public void testEquals() {
        System.out.println("equals");
        Object obj = null;
        MessageE instance = new MessageE();
        boolean expResult = false;
        boolean result = instance.equals(obj);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
