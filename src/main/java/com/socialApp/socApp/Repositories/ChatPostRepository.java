package com.socialApp.socApp.Repositories;

import com.socialApp.socApp.Beans.ChatPost;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ChatPostRepository extends JpaRepository<ChatPost, Integer> {
    ChatPost findByIdAndIsPublicTrue(int id);
    List<ChatPost> findByIsPublicTrue();
    void deleteByIdAndIsPublicTrue(int id);
}
