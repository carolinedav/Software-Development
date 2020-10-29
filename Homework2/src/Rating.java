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
	private User user;
	
	/**
	* empty constructor
	*/
	public Rating() {
		score = 0;
		user = new User();
		
	}
	
	/**
	* constructor : initializes each variable of class Rating
	*/
	public Rating(User user, int score) {
		this.user = user;
		this.score = score;
	}
	
	@Override 
	/**
	* toString : @return String "username rates score"
	*/
	public String toString() {
		return user.getUserName() + " rates " + getScore();
	}
	
	/**
	* equals : @return boolean; returns true if score and user are equal 
	*/
	public boolean equals(Object o) {
		if (o == null)
			return false;
		if (getClass() != o.getClass())
			return false;
		if(this == o)
			return true;
		
		Rating other = (Rating) o;
		return(score == other.score && user.equals(other.user));
	}

	/**
	* getScore : @return score
	*/
	public int getScore() {
		return score;
	}
	/**
	* setScore : @return a score of rating +1, -1, or 0, respectively

	*/
	public void setScore(int score) {
		if(score > 0)
			this.score = 1;
		else if(score == 0)
			this.score = 0;
		else
			this.score = -1;
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
