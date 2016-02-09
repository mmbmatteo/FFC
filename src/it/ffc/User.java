package it.ffc; /**
 * Write a description of class user here.
 * Flav User
 * @mmb (your name) 
 * @1 (a version number or a date)
 */

import java.util.*;

public class User {
	
    private     long            userIdNumber;
    private     String          name;
    private     String          surname;
    private     String          nickname;
    private     String          genre;
    private     String          hometown;
    private     String          description;
    private     String          email;
    private     String          password;
    private     Date            dateOfBirth; 
    // private     Feedback[]      feedback;
    public     ArrayList<Post>	posts = new ArrayList<Post>();	//public for Demo assigning
    // private     Post[]          flags;
    // private     Post[]          bookmarks;
    // private     Message[]       messages;
    // private     Transaction[]   transactions;
    //private     pic     jpg;

	public User (String email, String password) {
		this.email = email;
		this.password = password;
	}
	
	public String getCredentials() {
		String credentials = email + " " + password;
		return credentials;
	}
	
	public String getEmail() {
		return email;
	}
	
	public ArrayList<Post> getMyPosts(){
		return posts;
	}
	
	public void uploadPost(Post post) {
		posts.add(post);
	}
}
	
	
		/*FLAV METHODS*/
//     public User     updateUser(User);
//     public User     login(String email, String password); 
//     public boolean  deleteUser(User);    

    

