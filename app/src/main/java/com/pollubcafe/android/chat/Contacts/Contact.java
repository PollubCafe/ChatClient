package com.pollubcafe.android.chat.Contacts;


public class Contact {

    private String name;
    private String date;
    private String lastMessage;

    public Contact(String name, String date, String lastMessage) {
        this.name = name;
        this.date = date;
        this.lastMessage = lastMessage;
    }

    public String getName() {
        return name;
    }

    public String getDate() {
        return date;
    }

    public String getLastMessage() {
        return lastMessage;
    }
}
