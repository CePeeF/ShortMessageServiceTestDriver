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
    
    private UserRepoInterface userRepo = null;
    
    public UserRepoTest() {
        this.userRepo = null;
    }
    
    @Before
    public void createDummies() {
        userRepo = new MockUserRepo();
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
        List<UserE> userList = userRepo.getAllUsers();
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
        List<UserE> userList = userRepo.getAllUsers();
        for (UserE u: userList)
            if(u.getName().equals("testUser3") && u.getCity().equals("testCity3"))
            {bool = true;
                break;}
        assertTrue(bool);
    }

    /**
     * Test of deleteUser method, of class ShortMessageService.
     */
    @Test
    public void testDeleteUser() {
        userRepo.deleteUser("testUser1");
        List<UserE> userList = userRepo.getAllUsers();
        boolean bool = false;
        for (UserE u: userList)
            if(u.getName().equals("testUser1"))
            {bool = true;
                break;}
        assertFalse(bool);
    }

    /**
     * Test of getUsers method, of class ShortMessageService.
     */
    @Test
    public void testGetAllUsers() {
        boolean bool1 = false;
        boolean bool2 = false;
        List<UserE> userList = userRepo.getAllUsers();
        for (UserE uE: userList){
            if(uE.getName().equals("testUser1")) {
                bool1 = true;
            } else if(uE.getName().equals("testUser2")) {
                bool2 = true;
            }
        }
        assertTrue(bool1 && bool2);
    }
    
    /**
     * Test of findByUserName method, of class UserRepo.
     */
    @Test
    public void testFindByUserName() {
        String username = "testUser2";
        UserE result = userRepo.findByUserName(username);
        assertTrue(result.getName().equals(username));
    }

    /**
     * Test of userExits method, of class UserRepo.
     */
    @Test
    public void testUserExits() {
        String username = "testUser1";
        assertTrue(userRepo.userExits(username));
    }
    
}
