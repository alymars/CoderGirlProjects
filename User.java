package Microblog;

import java.net.URL;
import java.util.ArrayList;

public class User {

    private String avatarUrl;
    private String username;
    private String realName;
    private String emailAddress;

    public User (String username, String realName, String emailAddress, String avatarUrl) {
        this.avatarUrl = avatarUrl;
        this.username = username;
        this.realName = realName;
        this.emailAddress = emailAddress;
    }


    public String getAvatarUrl() {
        return avatarUrl;
    }

    public String getUsername() {
        return username;
    }

    public String getRealName() {
        return realName;
    }

    public String getEmailAddress() {
        return emailAddress;
    }
}


