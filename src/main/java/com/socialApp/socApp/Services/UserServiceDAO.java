package com.socialApp.socApp.Services;

import com.socialApp.socApp.Beans.Post;
import com.socialApp.socApp.Beans.User;

import java.util.List;

public interface UserServiceDAO {
    void updateUser(User user);
    void deleteUserById(int id);

    void createPost(Post post);
    void updatePost(Post post);
    void deletePostById(int id);
    List<Post> readAllUserPosts();
}
