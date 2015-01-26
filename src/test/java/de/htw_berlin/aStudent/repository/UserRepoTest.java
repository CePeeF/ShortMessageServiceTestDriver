package de.htw_berlin.aStudent.repository;

import de.htw_berlin.aStudent.model.UserE;
import java.util.List;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Eredrian
 */
public class UserRepoTest {
    
    private UserRepo userRepo = null;
    
    public UserRepoTest() {
        this.userRepo = null;
    }
    
    @Before
    public void createDummies() {
        userRepo = new UserRepo();
        userRepo.createUser("testUser1", "testCity1");
        userRepo.createUser("testUser2", "testCity2");
    }
    
    @After
    public void deleteDummies() {
        userRepo = null;
    }

     /**
     * Test of createUser method, of class ShortMessageService.
     */
    @Test
    public void testCreateUserCheckName() {
        userRepo.createUser("testUser3", "testCity3");
        boolean bool = false;
        List<UserE> userList = UserRepo.getAllUsers();
        for (UserE u: userList)
            if(u.getName().equals("testUser3"))
            {bool = true;
                break;}
        assertTrue(bool);
    }

    @Test
    public void testCreateUserCheckCity() {
        userRepo.createUser("testUser3", "testCity3");
        boolean bool = false;
        List<UserE> userList = UserRepo.getAllUsers();
        for (UserE u: userList)
            if(u.getName().equals("testUser3") && u.getCity().equals("testCity3"))
            {bool = true;
                break;}
        assertTrue(bool);
    }

    @Test(expected=NullPointerException.class)
    public void testCreateUserIsNull() {
        userRepo.createUser(null, "testCity1");
    }

    @Test(expected=NullPointerException.class)
    public void testCreateUsersCityIsNull() {
        userRepo.createUser("testUser3", null);
    }

    @Test(expected=IllegalArgumentException.class)
    public void testCreateUserExists() {
        userRepo.createUser("testuser1", "Berlin");
    }

    @Test(expected=IllegalArgumentException.class)
    public void testCreateUserNameTooLong() {
        String userName = "";
        for(int i = 0; i<= 31; i++){
            userName += "u";
        }
        userRepo.createUser(userName, "testCity1");
    }

    @Test(expected=IllegalArgumentException.class)
    public void testCreateUserNameTooShort() {
        userRepo.createUser("123", "testCity1");
    }

    /**
     * Test of deleteUser method, of class ShortMessageService.
     */
    @Test
    public void testDeleteUser() {
        userRepo.deleteUser("testUser1");
        List<UserE> userList = UserRepo.getAllUsers();
        boolean bool = false;
        for (UserE u: userList)
            if(u.getName().equals("testUser1"))
            {bool = true;
                break;}
        assertFalse(bool);
    }

    @Test(expected=IllegalArgumentException.class)
    public void testDeleteUserDoesNotExist() {
        UserRepo.deleteUser("testUser3");
    }

    /**
     * Test of getUsers method, of class ShortMessageService.
     */
    @Test
    public void testGetAllUsers() {
        boolean bool = false;
        List<UserE> userList = UserRepo.getAllUsers();
        assertTrue(userList.contains("testUser2") && userList.contains("testUser1"));
    }
    
    /**
     * Test of findByUserName method, of class UserRepo.
     */
    @Test
    public void testFindByUserName() {
        System.out.println("findByUserName");
        String username = "";
        UserE expResult = null;
        UserE result = UserRepo.findByUserName(username);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of userExits method, of class UserRepo.
     */
    @Test
    public void testUserExits() {
        System.out.println("userExits");
        String username = "";
        boolean expResult = false;
        boolean result = UserRepo.userExits(username);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
