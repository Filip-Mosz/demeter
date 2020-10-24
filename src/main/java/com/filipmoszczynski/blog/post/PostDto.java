package com.filipmoszczynski.blog.post;

public class PostDto {

    private String id;
    private String title;
    private String date;
    private String author;
    private String content;

    public String getId() {
        return id;
    }

    public PostDto setId(String id) {
        this.id = id;
        return this;
    }

    public String getTitle() {
        return title;
    }

    public PostDto setTitle(String title) {
        this.title = title;
        return this;
    }

    public String getDate() {
        return date;
    }

    public PostDto setDate(String date) {
        this.date = date;
        return this;
    }

    public String getAuthor() {
        return author;
    }

    public PostDto setAuthor(String author) {
        this.author = author;
        return this;
    }

    public String getContent() {
        return content;
    }

    public PostDto setContent(String content) {
        this.content = content;
        return this;
    }
}
