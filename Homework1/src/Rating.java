import java.util.*;
/**
* 
* @author Caroline Davis (cnd7cy)
*  09/18/2020
*  Rating class, used to create ratings for the users of the app
*  
**/
public class Rating {
	
	//instance variables
	private int score;
	private User user = new User();
	
	/**
	* empty constructor
	*/
	public Rating() {
		
	}
	
	/**
	* constructor : initializes each variable of class Rating
	*/
	public Rating(int score, User user) {
		this.score = score;
		this.user = user;
	}
	
	@Override 
	/**
	* toString : @return String
	*/
	public String toString() {
		/** STUB/TODO : toString method **/
		return "";
	}
	
	/**
	* equals : @return boolean
	*/
	public boolean equals(Rating rating) {
		/** STUB/TODO : determines equality for Rating object **/
        return true;
	}

	/**
	* getScore : @return score
	*/
	public int getScore() {
		return score;
	}
	/**
	* setScore : @return void
	*/
	public void setScore(int score) {
		this.score = score;
	}
	/**
	* getUser : @return user
	*/
	public User getUser() {
		return user;
	}

	/**
	* setUser : @return void
	*/
	public void setUser(User user) {
		this.user = user;
	}
	
}
