package com.socialApp.socApp.Services;

import com.socialApp.socApp.Beans.Post;
import com.socialApp.socApp.Beans.User;

import java.util.List;

public interface AdminServiceDAO {
    User readUserById(int id);
    List<User> readAllUsers();
    void updateUser(User user);
    void deleteUserById(int id);

    void createPost(Post post);
    Post readPublicPostById(int id);
    List<Post> readAllAdminPosts();
    void deletePublicPostById(int id);
    void deleteAdminPostById(int id);
}
