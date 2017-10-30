package com.example.cspeir.collegeapp;

/**
 * Created by bleitzel on 10/20/2017.
 */

public abstract class Applicant {
    private String email;
    private String objectId;

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    public String getObjectId() {
        return objectId;
    }

    public void setObjectId(String objectId) {
        this.objectId = objectId;
    }
}
