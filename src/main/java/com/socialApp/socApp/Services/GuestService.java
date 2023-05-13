package com.socialApp.socApp.Services;

import com.socialApp.socApp.Beans.Post;
import com.socialApp.socApp.Beans.User;
import com.socialApp.socApp.Repositories.PostRepository;
import com.socialApp.socApp.Repositories.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class GuestService implements GuestServiceDAO {
    private final UserRepository userRepository;
    private final PostRepository postRepository;

    @Override
    public void createNewUser(User user) {
        userRepository.save(user);
    }

    @Override
    public List<Post> readAllPublicPosts() {
        return postRepository.findByIsPublicTrue();
    }

    @Override
    public List<User> readAllUsers() {
        return userRepository.findAll();
    }
}
