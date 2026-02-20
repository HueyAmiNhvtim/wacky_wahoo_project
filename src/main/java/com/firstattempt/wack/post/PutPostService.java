package com.firstattempt.wack.post;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

@Service
public class PutPostService {
    public ResponseEntity<String> execute() {
        return ResponseEntity.status(HttpStatus.OK).body("Post updated");
    }
}
