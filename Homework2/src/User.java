import java.util.*;

/**
* 
* @author Caroline Davis (cnd7cy)
*  09/18/2020
*  User class, used to create a user of the Meme Magic app
*  
**/

public class User {
	//instance variables  declaration; only creates location on stack
	private String userName;
	private ArrayList<Meme> memesCreated;
	private ArrayList<Meme> memesViewed;
	
	/**
	* empty constructor : looks up variable or new (call constructor) on the heap
	*/
	public User() {
		userName = "";
		memesCreated = new ArrayList<Meme>();
		memesViewed = new ArrayList<Meme>();
		
	}
	
	public User(String userName) {
		this.userName = userName;
		memesCreated = new ArrayList<Meme>();
		memesViewed = new ArrayList<Meme>();
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
	public void rateMeme(Feed feed, int rating) {
		/** STUB/TODO : give rating to meme **/
	}
	
	
	/**
	* createMeme : @return creates a new Meme object for current user
	* adds the resulting Meme to the list of createdMemes for the user. 

	*/
	public Meme createMeme(BackgroundImage backgroundImage, String caption) {
		Meme meme = new Meme(backgroundImage, caption, this);
		memesCreated.add(meme);
		return meme;

	}
	
	/**
	* deleteMeme : @return boolean ; deletes the meme if found in memesCreated and if the shared value is false
	*/
	public boolean deleteMeme(Meme meme) {
		if(memesCreated.contains(meme) && meme.getShared() == false) {
			memesCreated.remove(meme);
			return true;
		}
		else
			return false;
	}
	
	/**
	* shareMeme : @return void ; marks the meme as shared and copies it to the memes ArrayList on the Feed
	*/
	public void shareMeme(Meme meme, Feed feed) {
		boolean shared = true;
		meme.setShared(shared);
		feed.getMemes().add(meme);
		
	}
	
	/**
	* rateNextMeme : @return void ; The method will get a Meme from the Feed (supplied as an argument) using the getNewMeme(User) method of the Feed class. 
	* It will record that Meme as having been seen and give it a ratingScore.
	*  If there are no Memes left to view, print a message to the console and return

	*/
	public void rateNextMeme(Feed feed, int score) {
		Meme meme = feed.getNewMeme(this);
		if(feed.getNewMeme(this) == null) {
			System.out.println("No more new memes to see");
		}
		else {
			Rating rating = new Rating(this, score);
			meme.getRatings().add(rating);
			memesViewed.add(meme);
		}
	}
	
	/**
	* calculateReputation : @return double (using 0.0) ; returns a value calculated as a sum of all ratings ;
	*  0.0 should be returned if the user has not created any memes or had any memes rated
	*/
	public double calculateReputation() {
		double sum = 0.0;
		if(memesCreated.size() == 0)
			return sum;
		for(int i = 0; i < memesCreated.size(); i++)
			sum += memesCreated.get(i).calculateRating();
		return sum;
	}
	
	@Override 
	/**
	* toString : @return String ; "username has rated (number of memes viewed) memes, (reputation)"
	*/
	public String toString() {
		return userName + " has rated" + " (" + memesViewed.size() + ") " + "memes, (" + calculateReputation() + ")";
	}
	
	
	/**
	* equals : @return boolean ; returns true if the username matches
	*/
	public boolean equals(Object o) {
		if (o == null)
			return false;
		if (getClass() != o.getClass())
			return false;
		if(this == o)
			return true;
		
		User other = (User) o;
		return(userName.equals(other.userName));
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
