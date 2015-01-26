package de.htw_berlin.aStudent.model;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Eredrian
 */
public class UserETest {
    
    private UserE userInstance = null;
    private UserE userInstance2 = null;
    
    public UserETest() {
    }
    
    @Before
    public void before() throws Exception {
        userInstance = new UserE("TestName", "TestCity");
        userInstance2 = new UserE("TestName2", "TestCity2");
    }
    
    @After
    public void after() throws Exception {
        userInstance = null;
        userInstance2 = null;
    }

    /**
     * Test of getName method, of class UserE.
     */
    @Test
    public void testGetName() throws Exception {
        assertEquals("TestName", userInstance.getName());
    }

    /**
     * Test of getCity method, of class UserE.
     */
    @Test
    public void testGetCity() throws Exception {
        assertEquals("TestCity", userInstance.getCity());
    }

    /**
     * Test of hashCode method, of class UserE.
     */
    @Test
    public void testHashCode() {        
       // assertEquals("TestCity", userInstance.getCity());
    }

    /**
     * Test of equals method, of class UserE.
     */
    @Test
    public void testEquals() {
      //  assertEquals("TestCity", userInstance.getCity());
    }    
}
