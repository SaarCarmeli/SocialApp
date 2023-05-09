package com.socialApp.socApp.Repositories;

import com.socialApp.socApp.Beans.Post;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface PostRepository extends JpaRepository<Post, Integer> {
    Post findByIdAndIsPublicTrue(int id);
    List<Post> findByIsPublicTrue();
    void deleteByIdAndIsPublicTrue(int id);
}
