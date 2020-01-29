package zadnie_1001_BeanForumUser;

import org.junit.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.util.Assert;

@RunWith(SpringRunner.class)
@SpringBootTest
public class ForumUserTestSuite {
    @Test
    public void testGetUsername() {
        //Given skąd brać
        ApplicationContext context = new AnnotationConfigApplicationContext("zadnie_1001_BeanForumUser");
        ForumUser forumUser = new ForumUser();
        forumUser.getUserName();
        ForumUser user = context.getBean(ForumUser.class);
        //When
        String name = user.getUserName();
        //Then
        Assert.assertEquals("John Smith", name);
    }
}

