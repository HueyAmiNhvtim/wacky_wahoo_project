package com.firstattempt.wack.post;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

@Service
public class DeletePostService {
    public ResponseEntity<String> execute() {
        return ResponseEntity.status(HttpStatus.NO_CONTENT).body("Product deleted");
    }
}
