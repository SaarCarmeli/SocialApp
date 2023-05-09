package com.socialApp.socApp.Services;

import com.socialApp.socApp.Beans.Post;
import com.socialApp.socApp.Beans.User;

import java.util.List;

public class GuestService implements GuestServiceDAO {
    @Override
    public void createNewUser(User user) {

    }

    @Override
    public List<Post> readAllPublicPosts() {
        return null;
    }
}
