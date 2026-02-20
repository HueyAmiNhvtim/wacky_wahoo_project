package com.firstattempt.wack.post;

import org.springframework.web.bind.annotation.*;


@RestController
public class PostController {

    @PostMapping
    public String createPost() {
        return "Post created";
    }

    @GetMapping
    public String getPost() {
        return "Post got";
    }

    @PutMapping
    public String putPost() {
        return "Post updated";
    }

    @DeleteMapping
    public String delPost() {
        return "Post deleted";
    }
}
