package com.firstattempt.wack;

import org.springframework.http.ResponseEntity;

// For POST, PUT, PATCH requests, anything that concerns appending or modification or removal of data.
public interface Command<I, O> {
    ResponseEntity<O> execute(I input);
}
