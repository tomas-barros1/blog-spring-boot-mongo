package org.blog.mongodb.services;

import org.blog.mongodb.entities.Post;
import org.blog.mongodb.repositories.PostRepository;
import org.blog.mongodb.services.exception.ObjectNotFoundException;
import org.springframework.stereotype.Service;

import java.time.Instant;
import java.time.temporal.ChronoUnit;
import java.util.List;
import java.util.Optional;

@Service
public class PostService {

    private final PostRepository postRepository;

    public PostService(PostRepository postRepository) {
        this.postRepository = postRepository;
    }

    public Post findById(String id) {
        Optional<Post> post = postRepository.findById(id);
        return post.orElseThrow(() -> new ObjectNotFoundException("Objeto não encontrado"));
    }

    public List<Post> findByTitle(String text) {
        return postRepository.searchTitle(text);
    }

    public List<Post> fullSearch(String text, Instant minDate, Instant maxDate) {
        maxDate = Instant.from(maxDate).plus(1, ChronoUnit.DAYS);
        return postRepository.fullSearch(text, minDate, maxDate);
    }
}
