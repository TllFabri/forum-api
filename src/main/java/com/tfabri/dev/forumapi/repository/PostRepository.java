package com.tfabri.dev.forumapi.repository;

import com.tfabri.dev.forumapi.entity.Post;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PostRepository extends JpaRepository<Post, Long> {
}