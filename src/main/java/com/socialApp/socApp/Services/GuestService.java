package com.socialApp.socApp.Services;

import com.socialApp.socApp.Beans.ChatPost;
import com.socialApp.socApp.Beans.User;
import com.socialApp.socApp.Repositories.ChatPostRepository;
import com.socialApp.socApp.Repositories.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class GuestService implements GuestServiceDAO {
    private final UserRepository userRepository;
    private final ChatPostRepository chatPostRepository;

    @Override
    public void createNewUser(User user) {
        userRepository.save(user);
    }

    @Override
    public List<ChatPost> readAllPublicChatPosts() {
        return chatPostRepository.findByIsPublicTrue();
    }

    @Override
    public List<User> readAllUsers() {
        return userRepository.findAll();
    }
}
