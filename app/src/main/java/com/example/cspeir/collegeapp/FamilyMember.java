package com.example.cspeir.collegeapp;

/**
 * Created by bleitzel on 10/6/2017.
 */

public abstract class FamilyMember extends Applicant {
    private String firstName;
    private String lastName;
    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }



    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
    public FamilyMember(){
        firstName="Matthew";
        lastName = "Speir";
    }
    public FamilyMember (String first, String last){
        this.firstName = first;
        this.lastName = last;
    }

}
