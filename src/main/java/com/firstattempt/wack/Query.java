package com.firstattempt.wack;


import org.springframework.http.ResponseEntity;

// Used for GET requests
public interface Query<I, O> {
    ResponseEntity<O> execute(I input);
}
