package com.socialApp.socApp.Services;

import com.socialApp.socApp.Beans.ChatPost;
import com.socialApp.socApp.Beans.User;
import com.socialApp.socApp.Repositories.ChatPostRepository;
import com.socialApp.socApp.Repositories.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class AdminService implements AdminServiceDAO {
    private final UserRepository userRepository;
    private final ChatPostRepository chatPostRepository;

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
    public void createChatPost(ChatPost chatPost) {

    }

    @Override
    public void updateChatPost(ChatPost chatPost) {
        if (chatPostRepository.existsById(chatPost.getId())) {
            chatPostRepository.save(chatPost);
        } else {

        }
    }

    @Override
    public void deleteChatPostById(int id) {
        if (chatPostRepository.existsById(id)) {
            chatPostRepository.deleteById(id);
        } else {

        }
    }
}
