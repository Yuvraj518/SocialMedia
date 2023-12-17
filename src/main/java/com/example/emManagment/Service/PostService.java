package com.example.emManagment.Service;

import com.example.emManagment.Model.Post;
import com.example.emManagment.Repository.PostRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PostService {
    @Autowired
    PostRepository postRepository;

    public Post getPostById(Long id) {
        return postRepository.findById(id).orElse(null);
    }

    public Post createPost(Post post) {
        // Add logic for post creation, validation, and business rules
        return postRepository.save(post);
    }

    public Post updatePost(Long id, Post post) {
        // Add logic for post updating, validation, and business rules
        post.setId(id);
        return postRepository.save(post);
    }

    public void deletePost(Long id) {
        // Add logic for post deletion, handle related entities, etc.
        postRepository.deleteById(id);
    }
}
