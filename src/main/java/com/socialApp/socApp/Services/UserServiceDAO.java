package com.socialApp.socApp.Services;

import com.socialApp.socApp.Beans.Post;
import com.socialApp.socApp.Beans.User;

import java.util.List;

public interface UserServiceDAO {
    User readUserById(int id);
    void updateUser(User user);
    void deleteUserById(int id);

    void createPost(Post post);
    List<Post> readAllUserPosts();
    void
}
