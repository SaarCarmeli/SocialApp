package com.socialApp.socApp.Repositories;

import com.socialApp.socApp.Beans.Post;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PostRepository extends JpaRepository<Post, Integer> {
}
