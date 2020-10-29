import java.util.*;

/**
* 
* @author Caroline Davis (cnd7cy)
*  09/18/2020
*  User class, used to create a user of the Meme Magic app
*  
**/

public class User {
	//instance variables
	private String userName;
	private ArrayList<Meme> memesCreated = new ArrayList<Meme>();
	private ArrayList<Meme> memesViewed = new ArrayList<Meme>();
	
	/**
	* empty constructor
	*/
	public User() {
		
	}
	
	/**
	* constructor : initializes each variable of class User 
	*/
	public User(String userName, ArrayList<Meme> memesCreated, ArrayList<Meme> memesViewed) {
		this.userName = userName;
		this.memesCreated = memesCreated;
		this.memesViewed = memesViewed;
	}
	
	
	
	/**
	* rateMeme : @return void
	*/
	public void rateMeme(Meme meme, int rating) {
		/** STUB/TODO : give rating to meme **/
	}
	
	
	/**
	* createMeme : @return null
	*/
	public Meme createMeme(BackgroundImage backgroundimage, String caption) {
		/** STUB/TODO : create meme with background image and caption **/
		return null;
	}
	
	/**
	* deleteMeme : @return boolean
	*/
	public boolean deleteMeme(Meme meme) {
		/** STUB/TODO : deletes meme **/
		return true;
	}
	
	/**
	* shareMeme : @return void
	*/
	public void shareMeme(Meme meme, Feed feed) {
		/** STUB/TODO : shares meme on the feed **/
	}
	
	/**
	* rateNextMeme : @return void
	*/
	public void rateNextMeme(Feed feed, int ratingScore) {
		/** STUB/TODO : rates meme on feed with a rating score **/
	}
	
	/**
	* calculateReputation : @return double (using 0.0)
	*/
	public double calculateReputation() {
		/** STUB/TODO : calculates reputation **/
		return 0.0;
	}
	
	@Override 
	/**
	* toString : @return String
	*/
	public String toString() {
		/** STUB/TODO : returns String **/
		return "";
	}
	
	
	/**
	* equals : @return boolean
	*/
	public boolean equals(User user) {
		/** STUB/TODO : returns value of equality **/
		return true;
	}
	
	
	
	
	
	/**
	* getUserName : @return userName
	*/
	public String getUserName() {
		return userName;
	}
	/**
	* setUserName : @return void
	*/
	public void setUserName(String userName) {
		this.userName = userName;
	}
	
	
	
	/**
	* getMemesCreated : @return memesCreated
	*/
	public ArrayList<Meme> getMemesCreated() {
		return memesCreated;
	}
	/**
	* setMemesCreated : @return void
	*/
	public void setMemesCreated(ArrayList<Meme> memesCreated) {
		this.memesCreated = memesCreated;
	}
	
	
	
	/**
	* getMemesViewed: @return memesViewed
	*/
	public ArrayList<Meme> getMemesViewed() {
		return memesViewed;
	}
	/**
	* setMemesViewed: @return void
	*/
	public void setMemesViewed(ArrayList<Meme> memesViewed) {
		this.memesViewed = memesViewed;
	}
	
	
}
