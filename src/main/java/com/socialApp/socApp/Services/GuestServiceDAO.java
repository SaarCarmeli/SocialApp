package com.socialApp.socApp.Services;

import com.socialApp.socApp.Beans.Post;
import com.socialApp.socApp.Beans.User;

import java.util.List;

public interface GuestServiceDAO {
    void createNewUser(User user);
    List<Post> readAllPublicPosts();
}
