package com.graphql.learning.pojo;

public class Comment {

    String id;
    String text;
    String content;

    public Comment(String id, String text, String content) {
        this.id = id;
        this.text = text;
        this.content = content;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }
}
