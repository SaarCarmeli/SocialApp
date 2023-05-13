package com.socialApp.socApp.Services;

import com.socialApp.socApp.Beans.ChatPost;
import com.socialApp.socApp.Beans.User;

public interface UserServiceDAO {
    void updateUser(User user);
    void deleteUserById(int id);

    void createChatPost(ChatPost chatPost);
    void updateChatPost(ChatPost chatPost);
    void deleteChatPostById(int id);
}
