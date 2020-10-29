import java.util.*;

/**
* 
* @author Caroline Davis (cnd7cy)
*  09/18/2020
*  Meme class, used in creation of memes & various behaviors of the memes
*  
**/

public class Meme {
	private User creator = new User();
	private BackgroundImage backgroundimage;
	private ArrayList<Rating> ratings  = new ArrayList<Rating>();
	private String caption;
	private boolean shared;
	
	/**
	* empty constructor
	*/
	public Meme() {
		
	}
	/**
	* constructor : initializes each variable of class Meme
	*/
	public Meme(User creator, BackgroundImage backgroundimage, ArrayList<Rating> rating, String caption, boolean shared) {
		this.creator = creator;
		this.backgroundimage = backgroundimage;
		this.ratings = ratings;
		this.caption = caption;
		this.shared = shared;
	}
	
	@Override 
	/**
	* toString : @return String
	*/
	public String toString() {
		return "";
	}
	
	/**
	* equals : @return boolean
	*/
	public boolean equals(Rating ratings) {
		return true;
	}

	/**
	* getCreator : @return creator
	*/
	public User getCreator() {
		return creator;
	}
	/**
	* setCreator : @return void
	*/
	public void setCreator(User creator) {
		this.creator = creator;
	}

	/**
	* getBackgroundImage : @return backgroundimage
	*/
	public BackgroundImage getBackgroundImage() {
		return backgroundimage;
	}
	/**
	* setCreator : @return void
	*/
	public void setBackgroundImage(BackgroundImage backgroundimage) {
		this.backgroundimage = backgroundimage;
	}
	
	
	/**
	* getArrayList<Rating> : @return ratings
	*/
	public ArrayList<Rating> getRatings() {
		return ratings;
	}
	/**
	* setArrayList<Rating> : @return void
	*/
	public void setRatings(ArrayList<Rating> ratings) {
		this.ratings = ratings;
	}
	
	
	/**
	* getCaption : @return caption
	*/
	public String getCaption() {
		return caption;
	}
	/**
	* setCaption : @return void
	*/
	public void setCaption(String caption) {
		this.caption = caption;
	}
	/**
	* getShared : @return shared
	*/
	public boolean getShared() {
		return shared;
	}
	/**
	* setShared : @return void
	*/
	public void setShared(boolean shared) {
		this.shared = shared;
	}
	
	
}
