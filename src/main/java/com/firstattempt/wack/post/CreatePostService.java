package com.firstattempt.wack.post;

import com.firstattempt.wack.Command;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

@Service
public class CreatePostService implements Command<Void, String> {
    @Override
    public ResponseEntity<String> execute(Void input) {
        return ResponseEntity.status(HttpStatus.CREATED).body("Post created");
    }
}
