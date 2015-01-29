package de.htw_berlin.aStudent.repository;

import de.htw_berlin.aStudent.model.Topic;
import de.htw_berlin.aStudent.model.UserE;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.util.List;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

/**
 *
 * @author Eredrian
 */
public class TopicRepoTest {

    private TopicRepoInterface topicRepo = null;
    private UserRepoInterface userRepo = null;

    public TopicRepoTest() {
        this.topicRepo = null;
        this.userRepo = null;
    }
    
    @Before
    public void createDummies() {
        userRepo = new MockUserRepo();
        userRepo.createUser("testUser1", "testCity1");
        userRepo.createUser("testUser2", "testCity2");
        topicRepo = new MockTopicRepo(userRepo);
        topicRepo.createTopic("testUser1","testTopic1");
        topicRepo.createTopic("testUser2","testTopic2");
    }
    
    @After
    public void deleteDummies() {
        userRepo = null;
        topicRepo = null;
    }

     /**
     * Test of createUser method, of class ShortMessageService.
     */
    @Test
    public void testCreateTopicCheckTopicName() {
        topicRepo.createTopic("testUser2", "testTopic3");
        boolean bool = false;
        List<Topic> topicList = topicRepo.getAllTopics();
        for (Topic t: topicList)
            if(t.getTopicName().equals("testTopic3")) {
                bool = true;
                break;
            }
        assertTrue(bool);
    }

    @Test
    public void testCreateTopicCheckUserName() {
        topicRepo.createTopic("testUser2", "testTopic3");
        boolean bool = false;
        Topic topic = topicRepo.findByTopicName("testTopic3");
        assertTrue(topic.getUser().getName().equals("testUser2"));
    }

    /**
     * Test of deleteUser method, of class ShortMessageService.
     */
    @Test
    public void testDeleteTopic() {
        topicRepo.deleteTopic("testTopic1");
        List<Topic> topicList = topicRepo.getAllTopics();
        boolean bool = false;
        for (Topic t: topicList)
            if(t.getTopicName().equals("testTopic1")) {
                bool = true;
                break;
            }
        assertFalse(bool);
    }

    /**
     * Test of getUsers method, of class ShortMessageService.
     */
    @Test
    public void testGetAllTopics() {
        boolean bool1 = false;
        boolean bool2 = false;
        List<Topic> userList = topicRepo.getAllTopics();
        for (Topic tE: userList){
            if(tE.getTopicName().equals("testTopic1")) {
                bool1 = true;
            } else if(tE.getTopicName().equals("testTopic2")) {
                bool2 = true;
            }
        }
        assertTrue(bool1 && bool2);
    }
    
    /**
     * Test of findByUserName method, of class UserRepo.
     */
    @Test
    public void testFindByTopicName() {
        String topicName = "testTopic2";
        Topic result = topicRepo.findByTopicName(topicName);
        assertTrue(result.getTopicName().equals(topicName));
    }

    /**
     * Test of userExits method, of class UserRepo.
     */
    @Test
    public void testTopicExitsIfExists() {
        String topicName = "testTopic1";
        assertTrue(topicRepo.topicExits(topicName));
    }

    /**
     * Test of userExits method, of class UserRepo.
     */
    @Test
    public void testTopicExitsIfNotExists() {
        String username = "testTopic50";
        assertFalse(userRepo.userExits(username));
    }
}
