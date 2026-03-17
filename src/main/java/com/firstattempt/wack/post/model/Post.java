package com.firstattempt.wack.post.model;

import jakarta.persistence.*;


@Entity // Maps Java class to SQL
@Table(name = "posts")
public class Post {
    // A Post should have the following characteristics:
    // a link to the image.
    // Number of votes
    // Description of the whole thing.
    // Title too.
    private Long id;
    private String title;
    private String imageurl;
    private String description;
    private Integer votes;

    @Id // Primary key
    @GeneratedValue(strategy = GenerationType.IDENTITY) //auto-increments the id
    @Column(name = "id")
    public Long getId() {
        return this.id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    @Column(name = "title")
    public String getTitle() {
        return this.title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    @Column(name = "imageurl")
    public String getImageURL() {
        return this.imageurl;
    }

    public void setImageURL(String url) {
        this.imageurl = url;
    }

    @Column(name = "description")
    public String getDescription() {
        return this.description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Column(name = "votes")
    public Integer getVotes() {
        return this.votes;
    }

    public void setVotes(Integer votes) {
        this.votes = votes;
    }
}
