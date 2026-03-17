package com.firstattempt.wack.post.services;

import com.firstattempt.wack.Query;
import com.firstattempt.wack.post.model.Post;
import com.firstattempt.wack.post.model.PostRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GetPostService implements Query<Void, List<Post>> {

    private final PostRepository postRepository;

    @Autowired // Dependency injection!
    public GetPostService(PostRepository postRepository) {
        this.postRepository = postRepository;
    }

    @Override
    public ResponseEntity<List<Post>> execute(Void input) {
        List<Post> posts = postRepository.findAll();
        return ResponseEntity.status(HttpStatus.OK).body(posts);
    }
}
