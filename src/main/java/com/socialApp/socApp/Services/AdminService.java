package com.socialApp.socApp.Services;

import com.socialApp.socApp.Beans.Post;
import com.socialApp.socApp.Beans.User;

import java.util.List;

public class AdminService implements AdminServiceDAO {
    @Override
    public User readUserById(int id) {
        return null;
    }

    @Override
    public List<User> readAllUsers() {
        return null;
    }

    @Override
    public void updateUser(User user) {

    }

    @Override
    public void deleteUserById(int id) {

    }

    @Override
    public void createPost(Post post) {

    }

    @Override
    public Post readPublicPostById(int id) {
        return null;
    }

    @Override
    public List<Post> readAllPublicPosts() {
        return null;
    }

    @Override
    public List<Post> readAllAdminPosts() {
        return null;
    }

    @Override
    public void deletePublicPostById(int id) {

    }

    @Override
    public void deleteAdminPostById(int id) {

    }
}
