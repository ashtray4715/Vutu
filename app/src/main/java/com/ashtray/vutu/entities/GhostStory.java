package com.ashtray.vutu.entities;

public class GhostStory {
    private String writer;
    private String content;
    private int likes;

    public GhostStory(String writer, String content, int likes) {
        this.writer = writer;
        this.content = content;
        this.likes = likes;
    }

    public String getWriter() {
        return writer;
    }

    public String getContent() {
        return content;
    }

    public int getLikes() {
        return likes;
    }
}
