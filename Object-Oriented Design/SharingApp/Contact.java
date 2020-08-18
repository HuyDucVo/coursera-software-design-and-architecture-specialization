package com.example.sharingapp;

import java.util.UUID;

public class Contact {

    private String username;
    private String email;
    private String id;


    public Contact(String username, String email, String id) {
		if(username == null || email == null){
			throw new NullPointerException("Username or Email cannot be blank");
		}
        this.username = username;
        this.email = email;

        if (id == null){
            this.id = UUID.randomUUID().toString();
        } else {
            this.id = id;
        }
    }

    public String getId() {
        return id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }



}
