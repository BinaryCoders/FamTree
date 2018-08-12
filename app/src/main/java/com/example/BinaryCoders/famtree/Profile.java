package com.example.BinaryCoders.famtree;

import android.media.Image;

import java.util.Date;

import static java.lang.String.format;

public class Profile {
    private String firstname;
    private String middlename;
    private String lastname;
    private Date dateOfBirth;
    private Date dateOfDeath;
    private String countryBorn;
    private String currentCityOfResidence;
    private String currentCountryOfResidence;
    private String phoneNumber;
    private String email;
    private Image picture;
    private String bio;
    private String relationship;

    public Profile(String firstname, String middlename, String lastname, String relationship){
	this.firstname = firstname;
    }

    //getters

    //setters
    public void setMiddlename(String middlename){

    }

    public void setPhoneNumber(String phoneNumber){

    }

    public void addBio(String bio){

    }

    public void setEmail(String email){

    }

    public void updateRelationship(){

    }

    public void addPicture(Image pic){
        picture = pic;
    }

    public String ToString(){
        return format("First Name: {0} Middle Name: {1} Last Name: {2} ",firstname, middlename, lastname);
    }
}
