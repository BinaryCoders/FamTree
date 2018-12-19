package com.example.BinaryCoders.famtree;

import android.media.Image;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class Account {

    private String firstname;
    private String lastname;
    private String username;
    private String email;
    private String password;
    private Image profilePicture;
    private Profile myProfile;


    //add security questions
    public Account(){
        Scanner sc;
        FileManager f ;
        Image image;
    
    
    //getters for private attributes
    public String getFirstname() {
    return firstname;
    }
    public String getLastname() {
    return lastname;
    }
    Public String getUsername(){
    return username;
    }
    public String getEmail() {
    return email;
    }
    public String getPassword() {
    return password;
    }
    public Image getprofilePicture() {
    return profilePicture;
    }

    public boolean ChangePassword(String oldPassword, String newPassword){
for(int i=0; i<passwordBank.length; i++;) {
	if(oldPassword.equalsIgnoreCase(passwordBank.get(i).getPassword())) {
		passwordBank.set(i, newPassword); //update password;
	}

	System.out.println("Password reset successfully!");
}
else {
        return false;
}
    
    //scanner option
        
        System.out.println("Enter old password");
        String oldPassword=sc.nextline();
        for(int i=0; i< passwordBank.length; i++;) {
        if(oldPassword.equalsIgnoreCase(passwordBank.get(i).getPassword())) { 
        	System.out.println("Enter new Password");
        	String newPassword= sc.nextLine();
        	passwordBank.set(i, newPassword); //update password
        	
        }
        System.out.println("Password reset successfully!");
        }
        else {
        	 System.out.println("Password donot match.");
        }
    }
     // what happens if user's password donot match? any trials we should have?   

    public boolean ChangeEmail(String email, String password ){
    
for(int i=0; i < emailBank.length; i++;) {
	for(int j=0; j < passwordBank.length; j++;) {
	if(email.equalsIgnoreCase(emailBank.get(i).getEmail()) && password.equalsIgnoreCase(passwordBank.get(j).getPassword())) {
	
		emailBank.set(i, email); // update email
	
	}
	System.out.println("Email changed successfully");
}
}
	else {
        return false;
    }
}
	// problem: how to ensure that password provided exactly matches email given


    public void forgotPassword(){
    	System.out.println("Enter username");
    	String myUsername= sc.nextLine();

    	for(int i=0; i< usernameBank.length; i++;) {
    		if(myUsername.equalsIgnoreCase(usernameBank.get(i).getUsername())) {
    			System.out.println("Enter new password");
    			String newPassword= sc.nextline();
    			passwordBank.set(i, newPassword); //update password
    		}
    	}
    	else {
    		System.out.println("Incorrect username");
    	}
    }
    
public void createAccount(String username, String email, String password) {
	
	ArrayList(Account)usernameBank= new ArrayList<Account>();
	ArrayList(Account)emailBank= new ArrayList<Account>();
	ArrayList(Account)passwordBank= new ArrayList<Account>();
	
	System.out.println("Enter your username %n username may contain letters and numbers");
	String myUserName= sc.nextline();
	System.out.println("Enter your email address");
	String myEmail= sc.nextline();
	System.out.println("Enter your  passsword %n password should contain atleast one uppercase letter and numbers");
	String myPassword= sc.nextline();
	 
	//add the details of the user to the array list.
	usernameBank.add(myUserName);
	emailBank.add(myEmail);
	passwordBank.add(myPassword);
	
}

}
}
