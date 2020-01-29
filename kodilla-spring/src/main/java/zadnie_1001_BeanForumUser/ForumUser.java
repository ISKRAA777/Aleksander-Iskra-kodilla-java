package zadnie_1001_BeanForumUser;

import org.springframework.stereotype.Component;

@Component
public class ForumUser {
    private String username;
    //konstruktor daje obiekty klasy jw
    public ForumUser(){
        username =  "John Smith";

    }
    // poniższy getter pozwala na używanie username w innych klasach niż forumUser
    public String getUserName() {
        return username;
    }
}
