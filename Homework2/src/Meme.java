import java.util.*;

/**
* 
* @author Caroline Davis (cnd7cy)
*  09/18/2020
*  Meme class, used in creation of memes & various behaviors of the memes
*  
**/

public class Meme {
	private User creator;
	private BackgroundImage backgroundImage;
	private ArrayList<Rating> ratings;
	private String caption;
	private boolean shared;
	
	/**
	* constructor
	*/
	public Meme() {
		creator = new User();
		backgroundImage = new BackgroundImage();
		ratings  = new ArrayList<Rating>();
		caption = "";
		shared = false; 
		
	}
	/**
	* constructor : initializes each variable of class Meme
	*/
	public Meme(BackgroundImage backgroundImage, String caption, User creator, ArrayList<Rating> ratings, boolean shared) {
		this.creator = creator;
		this.backgroundImage = backgroundImage;
		this.caption = caption;
		this.ratings = ratings;
		this.shared = shared; 
	}
	
	public Meme(BackgroundImage backgroundImage, String caption, User creator) {
		this.creator = creator;
		this.backgroundImage = backgroundImage;
		this.caption = caption;
		ratings  = new ArrayList<Rating>();
	}
	
	@Override 
	/**
	* toString : @return String --> "backgroundImage 'caption' author (reputation) meme calculated rating 
	* [(number of +1 ratings) +1 (number of -1 ratings) -1]"
	*/
	public String toString() {
		double reputation = creator.calculateReputation();
		int oneCount = 0;
		int minusOneCount = 0;
		for(Rating rating : ratings) {
			if(rating.getScore() == 1) 
				oneCount++;
			else if (rating.getScore() == -1)
				minusOneCount++;
		}
		String calRatings = "(" + oneCount + ")" + " +1 " + "(" + minusOneCount + ") " + "-1";
		String intialStr =  backgroundImage + " '" + caption + "' " + creator.getUserName() + " (" + reputation + ") " + calculateRating() + " [" + calRatings + "]";
		return intialStr;
	}
	
	/**
	* equals : @return boolean; returns true if creator, caption, and backgroundImage are equal
	*/
	public boolean equals(Object o) {
		if (o == null)
			return false;
		if (getClass() != o.getClass())
			return false;
		if(this == o)
			return true;
		
		Meme other = (Meme) o;
		return(creator.equals(other.creator) && caption.equals(other.caption) && backgroundImage.equals(other.backgroundImage));
	}
	/** 
	 * 
	 * calculateRating : @return a double that is a sum of all rating scores for this Meme; if there is no rating, 0.0 should be returned
	 */
	public double calculateRating(){
		double sum = 0.0;
		for(int i = 0; i < ratings.size(); i++) {
			sum += ratings.get(i).getScore();
			}
		return sum;
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
		return backgroundImage;
	}
	/**
	* setCreator : @return void
	*/
	public void setBackgroundImage(BackgroundImage backgroundImage) {
		this.backgroundImage = backgroundImage;
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
