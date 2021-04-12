package org.example.entity;

public class Request {
    private String name;
    private long phoneNumber;
    private String question;

    public Request(String name, long phoneNumber, String question) {
        this.name = name;
        this.phoneNumber = phoneNumber;
        this.question = question;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public long getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(long phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getQuestion() {
        return question;
    }

    public void setQuestion(String question) {
        this.question = question;
    }
}
