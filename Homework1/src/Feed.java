import java.util.*;
/**
* 
* @author Caroline Davis (cnd7cy)
*  09/18/2020
*  Feed class, used to create feed for interaction
*  
**/
public class Feed {
	
	//instance variables
	private ArrayList<Meme> memes = new ArrayList<Meme>();
	
	
	/**
	* empty constructor
	*/
	public Feed() {
		
	}
	
	/**
	* constructor : initializes each variable of class Feed
	*/
	public Feed(ArrayList<Meme> memes) {
		this.memes = memes;
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
	* getNewMeme : @return null
	*/
	public Meme getNewMeme(User user) {
		/** STUB/TODO : gets new meme on feed **/
		return null;
	}
	
	/**
	* getMemes : @return memes
	*/
	public ArrayList<Meme> getMemes() {
		return memes;
	}
	/**
	* setMemes : @return void
	*/
	public void setMemes(ArrayList<Meme> memes) {
		this.memes = memes;
	}
	
}
