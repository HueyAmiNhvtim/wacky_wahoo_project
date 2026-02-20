package com.firstattempt.wack.post;

import org.hibernate.sql.Delete;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


@RestController
public class PostController {

    /*
    * Dependency injection:
    * From wikipedia: An object or function receives other objects or functions that it requires, rather than
    * creating them internally. The technique aims to separate object creation and usage => more loosely coupled code!
    *
    * In this case, separation of the controller with the actual logic handling code!
    * Interesting thing about Spring's default autowiring, it will inspect the container and look for a bean with the
    * exact name as the property to autowire (dependency inject) it. So for createPostService, if there are multiple
    * implementations of the same CreatePostService, the name of the instance
    * will be determined as the "tiebreaker" for finding the exact implementation's class name!
    * */
    private final CreatePostService createPostService;
    private final GetPostService getPostService;
    private final PutPostService putPostService;
    private final DeletePostService delPostService;

    @Autowired
    public PostController(CreatePostService createPostService,
                          GetPostService getPostService,
                          PutPostService putPostService,
                          DeletePostService delPostService) {
        this.createPostService = createPostService;
        this.getPostService = getPostService;
        this.putPostService = putPostService;
        this.delPostService = delPostService;
    }

    @PostMapping
    public ResponseEntity<String> createPost() {
        return createPostService.execute(null);
    }

    @GetMapping
    public ResponseEntity<String> getPost() {
        return getPostService.execute(null);
    }

    @PutMapping
    public ResponseEntity<String> putPost() {
        return putPostService.execute(null);
    }

    @DeleteMapping
    public ResponseEntity<String> delPost() {
        return delPostService.execute(null);
    }
}
