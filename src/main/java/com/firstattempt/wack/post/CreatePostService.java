package com.firstattempt.wack.post;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

@Service
public class CreatePostService {
    public ResponseEntity<String> execute() {
        return ResponseEntity.status(HttpStatus.CREATED).body("Post created");
    }
}
