import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.Before;
import org.junit.Test;
/**
 * 
 * @author Caroline Davis (cnd7cy)
 * UserTest is the JUnit Test Case for the User class
 */

public class UserTest {

	private String userName;
	private ArrayList<Meme> memesCreated;
	private ArrayList<Meme> memesViewed;
	
	@Before
	/**
	 * tests the User constructor for correct declaration/instantiation
	 */
	public void userConstructorTest() {
		memesCreated = new ArrayList<Meme>();
		memesViewed = new ArrayList<Meme>();
		userName = "";
		User user1 = new User(userName);
		User user = new User(userName, memesCreated, memesViewed);
		user.setMemesCreated(memesCreated);
		user.setMemesViewed(memesViewed);
		user.setUserName(userName);
		assertEquals(userName, user.getUserName());
		assertEquals(userName, user1.getUserName());
		assertEquals(memesCreated, user.getMemesCreated());
		assertEquals(memesViewed, user.getMemesViewed());
	}
	

	@Test
	/**
	 * tests createMeme for return of a meme 
	 */
	public void createMemeTest() {
		User creator = new User();
		BackgroundImage backgroundImage = new BackgroundImage("imageFileName", "title", "description");
		String caption = "";
		Meme meme = new Meme(backgroundImage, caption, creator);
		assertEquals(meme, creator.createMeme(backgroundImage, caption));
	}
	
	@Test
	/**
	 * tests deleteMeme for return of the correct boolean value for both pathways
	 */
	public void deleteMemeTest() {
		User creator = new User();
		BackgroundImage backgroundImage = new BackgroundImage("imageFileName", "title", "description");
		String caption = "";
		Meme meme = new Meme(backgroundImage, caption, creator);
		creator.getMemesCreated().add(meme);
		meme.getShared();
		assertTrue(creator.deleteMeme(meme));
		
		creator.getMemesCreated().remove(meme);
		assertFalse(creator.deleteMeme(meme));
	}
	
	@Test
	/**
	 * tests shareMeme for correct boolean shared value and correct addition of the meme to feed.getMemes()
	 */
	public void shareMemeTest() {
		User creator = new User();
		Feed feed = new Feed();
		BackgroundImage backgroundImage = new BackgroundImage("imageFileName", "title", "description");
		String caption = "";
		Meme meme = new Meme(backgroundImage, caption, creator);
		creator.shareMeme(meme, feed);
		boolean b = true;
		assertEquals(b, meme.getShared());
	}
	
	@Test
	/**
	 * tests rateNextMeme for void return and correct rating addition to the meme
	 */
	public void rateNextMemeTest() {
		int score = 1;
		User user = new User();
		Feed feed = new Feed();
		Feed feed1 = new Feed();
		Rating rating = new Rating(user, score);
		//Feed feed = new Feed();
		BackgroundImage backgroundImage = new BackgroundImage("imageFileName", "title", "description");
		String caption = "";
		Meme meme = new Meme(backgroundImage, caption, user);
		Meme memeNull = new Meme();
		Meme meme1 = new Meme(backgroundImage, caption, user);
		assertEquals(0.0, memeNull.calculateRating(), 0.0);
		feed.getMemes().add(meme1);
		feed.getMemes().add(meme);
		meme.getRatings().add(rating);
		user.rateNextMeme(feed, score);
		assertTrue(meme.getRatings().size() > 0);
		
		
	}
	
	@Test
	/**
	 * tests calculateRepuatationMeme for return of correct double sum 
	 */
	public void calculateReputationTest() {
		User creator = new User();
		double sum = 0.0;
		assertEquals(0.0, sum, 0.0);
		
		BackgroundImage backgroundImage = new BackgroundImage("imageFileName", "title", "description");
		String caption = "";
		Meme meme = new Meme(backgroundImage, caption, creator);
		creator.getMemesCreated().add(meme);
		assertEquals(0.0, creator.calculateReputation(), 0);
		creator.getMemesCreated().add(meme);
		assertTrue(creator.getMemesCreated().size() > 0);
		
	}
	
	@Test
	/**
	 * tests toString for correct return of String value
	 */
	public void toStringTest() {
		User user = new User();
		String expected = userName + " has rated" + " (" + memesViewed.size() + ") " + "memes, (" + user.calculateReputation() + ")";
		assertEquals(user.toString(), expected);
	}
	
	@Test
	/**
	 * tests equals method for correct return of boolean value if userName matches
	 */
	public void equalsTest() {
		User user = new User();
		User userNull = null;
		assertFalse(user.equals(userNull));
		
		Rating rating = new Rating();
		assertFalse(user.equals(rating));
		
		User user1 = new User(userName, memesCreated, memesViewed);
		User user2 = user1;
		assertTrue(user2.equals(user1));
		
		User user3 = new User();
		assertEquals(user3, new User());
		
	}
	
	@Test
	/**
	 * tests getUserName and setUserName for correct return UserName and void, respectively
	 */
	public void getAndSetUserName() {
		User user = new User();
		user.setUserName(userName);
		assertEquals(userName, user.getUserName());
	}
	
	@Test
	/**
	 * tests getMemesCreated and setMemesCreated for correct return memesCreated and void, respectively
	 */
	public void getAndSetMemesCreated() {
		User user = new User();
		user.setMemesCreated(memesCreated);
		assertEquals(memesCreated, user.getMemesCreated());
	}
	
	@Test
	/**
	 * tests getMemesViewed and setMemesViewed for correct return memesViewed and void, respectively
	 */
	public void getAndSetMemesViewed() {
		User user = new User();
		user.setMemesCreated(memesViewed);
		assertEquals(memesViewed, user.getMemesViewed());
	}
}
