package com.socialApp.socApp.Services;

import com.socialApp.socApp.Beans.Post;
import com.socialApp.socApp.Beans.User;

public interface AdminServiceDAO {
    void updateUser(User user);
    void deleteUserById(int id);

    void createPost(Post post);
    void updatePost(Post post);
    void deletePostById(int id);
}
