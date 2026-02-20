package com.firstattempt.wack.post;

import com.firstattempt.wack.Query;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

@Service
public class GetPostService implements Query<Void, String> {
    @Override
    public ResponseEntity<String> execute(Void input) {
        return ResponseEntity.status(HttpStatus.OK).body("Post got");
    }
}
