package com.socialApp.socApp.Services;

import com.socialApp.socApp.Beans.Post;
import com.socialApp.socApp.Beans.User;
import com.socialApp.socApp.Repositories.PostRepository;
import com.socialApp.socApp.Repositories.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class AdminService implements AdminServiceDAO {
    private final UserRepository userRepository;
    private final PostRepository postRepository;

    @Override
    public void updateUser(User user) {
        if (userRepository.existsById(user.getId())) {
            userRepository.save(user);
        } else {

        }
    }

    @Override
    public void deleteUserById(int id) {
        if (userRepository.existsById(id)) {
            userRepository.deleteById(id);
        } else {

        }
    }

    @Override
    public void createPost(Post post) {

    }

    @Override
    public void updatePost(Post post) {
        if (postRepository.existsById(post.getId())) {
            postRepository.save(post);
        } else {

        }
    }

    @Override
    public void deletePostById(int id) {
        if (postRepository.existsById(id)) {
            postRepository.deleteById(id);
        } else {

        }
    }
}
