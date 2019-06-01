package com.example.canyard.model;

public class Messages {
    private String message;
    private String type;
    private String from;

    public Messages(String from) {
        this.from = from;
    }

    public Messages(String message, String type, String from) {
        this.message = message;
        this.type = type;
        this.from = from;
    }

    public Messages() {
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getFrom() {
        return from;
    }

    public void setFrom(String from) {
        this.from = from;
    }
}
