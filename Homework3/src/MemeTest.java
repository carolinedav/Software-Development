import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.Test;
/**
 * 
 * @author Caroline Davis (cnd7cy)
 * MemeTest is the JUnit Test Case for the Meme class
 */

public class MemeTest {

	private User creator;
	private BackgroundImage backgroundImage;
	private ArrayList<Rating> ratings;
	private String caption;
	private boolean shared;
	
	@Test
	/**
	 * tests the Meme constructor for correct declaration/instantiation
	 */
	public void memeConstructorTest() {
		User creator = new User();
		creator.setUserName("cnd7cy");
		BackgroundImage backgroundImage = new BackgroundImage("imageFileName", "title", "description" );
		caption = ""; 
		Meme meme = new Meme(backgroundImage, caption, creator);
		
		assertEquals(meme.getCreator(), creator);
		assertEquals(meme.getBackgroundImage(), backgroundImage);
		assertEquals(meme.getCaption(), caption);
		
	}
	
	@Test
	/**
	 * tests toString for correct return of String value
	 */
	public void toStringTest() {
		User creator = new User();
		creator.setUserName("cnd7cy");
		BackgroundImage backgroundImage = new BackgroundImage("imageFileName", "title", "description" );
		caption =  "";
		Meme meme = new Meme(backgroundImage, caption, creator);
		String expected = "title" + " <" + "description" + ">" + " '" + caption + "' " + "cnd7cy" + " (" + 0.0 + ") " + 0.0 + " [" + "(" + 0 + ")" + " +1 " + "(" + 0 + ") " + "-1" + "]";
		assertEquals(expected, meme.toString());
		
		

	}
	
	@Test
	/**
	 * tests ratingCount for correct return of + count if the meme's rating score is 1
	 */
	public void ratingCountTest() {
		int oneCount = 0;
		assertEquals(0, oneCount, 0.0);
		
		int score = 1;
		User user = new User();
		Rating rating = new Rating(user, score);
		User creator = new User();
		creator.setUserName("cnd7cy");
		BackgroundImage backgroundImage = new BackgroundImage("imageFileName", "title", "description" );
		caption =  "";
		Meme meme = new Meme(backgroundImage, caption, creator);
		meme.getRatings().add(rating);
		oneCount = meme.ratingCount();
		assertEquals(1, oneCount);
	}
	
	@Test
	/**
	 * tests ratingMinusCount for correct return of - count if the meme's rating score is -1
	 */
	public void ratingMinusCountTest() {
		int minusOneCount = 0;
		assertEquals(0, minusOneCount, 0.0);
		
		int score = -1;
		User user = new User();
		Rating rating = new Rating(user, score);
		User creator = new User();
		creator.setUserName("cnd7cy");
		BackgroundImage backgroundImage = new BackgroundImage("imageFileName", "title", "description" );
		caption =  "";
		Meme meme = new Meme(backgroundImage, caption, creator);
		meme.getRatings().add(rating);
		minusOneCount = meme.ratingMinusCount();
		assertEquals(1, minusOneCount);
	}
	
	@Test
	/**
	 * tests equals method for correct return of boolean value if creator, caption, and backgroundImage are equal 
	 */
	public void equalsTest() {
		User creator = new User();
		Rating rating = new Rating();
		creator.setUserName("cnd7cy");
		BackgroundImage backgroundImage = new BackgroundImage("imageFileName", "title", "description" );
		caption =  "";
		Meme meme = new Meme(backgroundImage, caption, creator);
		Meme meme2 = meme;
		assertTrue(meme.equals(meme2));

		Meme meme3 = null;
		assertFalse(meme2.equals(meme3));
		
		assertFalse(meme2.equals(rating));
		
		Meme memeOther = new Meme();
		assertEquals(memeOther, new Meme());
	}
	
	@Test
	/**
	 * tests calculateRating for correct return of double sum
	 */
	public void calculateRatingTest() {
		Meme meme = new Meme();
		User user = new User();
		Feed feed = new Feed();
		feed.getMemes().add(meme);
		user.rateNextMeme(feed, 1);
		assertEquals(1.0, meme.calculateRating(), 0.001);
	}
	
	@Test
	/**
	 * tests getCreator and setCreator for correct return creator and void, respectively
	 */
	public void getAndSetCreator() {
		Meme meme = new Meme();
		User creator = new User();
		meme.setCreator(creator);
		assertEquals(creator, meme.getCreator());
	}
	
	@Test
	/**
	 * tests getBackgroundImage and setBackgroundImage for correct return backgroundImage and void, respectively
	 */
	public void getAndSetBackgroundImage() {
		Meme meme = new Meme();
		BackgroundImage backgroundImage = new BackgroundImage("imageFileName", "title", "description" );
		meme.setBackgroundImage(backgroundImage);
		assertEquals(backgroundImage, meme.getBackgroundImage());
	}
	@Test
	/**
	 * tests getRatings and setRatings for correct return ratings and void, respectively
	 */
	public void getAndSetRatings() {
		Meme meme = new Meme();
		ArrayList<Rating> ratings = new ArrayList<Rating>();
		meme.setRatings(ratings);
		assertEquals(ratings, meme.getRatings());
	}
	
	@Test
	/**
	 * tests getCaption and setCaption for correct return caption and void, respectively
	 */
	public void getAndSetCaption() {
		Meme meme = new Meme();
		caption = "";
		meme.setCaption(caption);
		assertEquals(caption, meme.getCaption());
	}
	
	@Test
	/**
	 * tests getShared and setShared for correct return boolean shared and void, respectively
	 */
	public void getAndSetShared() {
		Meme meme = new Meme();
		shared = true;
		meme.setShared(shared);
		assertEquals(shared, meme.getShared());
	}
	
}
