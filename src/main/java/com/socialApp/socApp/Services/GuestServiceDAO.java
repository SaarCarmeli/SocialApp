package com.socialApp.socApp.Services;

import com.socialApp.socApp.Beans.ChatPost;
import com.socialApp.socApp.Beans.User;

import java.util.List;

public interface GuestServiceDAO {
    void createNewUser(User user);
    List<ChatPost> readAllPublicChatPosts();
    List<User> readAllUsers();
}
