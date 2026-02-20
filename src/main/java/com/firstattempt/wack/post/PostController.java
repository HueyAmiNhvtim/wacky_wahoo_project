package com.firstattempt.wack.post;

import org.apache.coyote.Response;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


@RestController
public class PostController {

    @PostMapping
    public ResponseEntity<String> createPost() {
        return ResponseEntity.status(HttpStatus.CREATED).body("Post created");
    }

    @GetMapping
    public ResponseEntity<String> getPost() {
        return ResponseEntity.status(HttpStatus.OK).body("Post got");
    }

    @PutMapping
    public ResponseEntity<String> putPost() {
        return ResponseEntity.status(HttpStatus.OK).body("Post updated");
    }

    @DeleteMapping
    public ResponseEntity<String> delPost() {
        return ResponseEntity.status(HttpStatus.NO_CONTENT).body("Product deleted");
    }
}
