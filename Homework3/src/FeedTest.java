import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.Before;
import org.junit.Test;
/**
 * 
 * @author Caroline Davis (cnd7cy)
 * FeedTest is the JUnit Test Case for the Feed class
 */

public class FeedTest {

	Feed feed = new Feed();
	Meme meme = new Meme();
	private ArrayList<Meme> memes;
	
	@Before 
	/**
	 * tests the Feed constructor for correct declaration/instantiation
	 */
	public void feedConstructorTest() {
		memes = new ArrayList<Meme>();
		Feed feed = new Feed(memes);
		assertEquals(memes, feed.getMemes());
	}
	
	@Test
	/**
	 * tests toString for correct return of String value
	 */
	public void toStringTest() {
		Feed feed = new Feed();
		Feed feed1 = feed;
		Feed feed2 = new Feed();
		User user = new User();
		BackgroundImage backgroundImage = new BackgroundImage("imageFileName", "title", "description");
		Meme meme = user.createMeme(backgroundImage, "caption");
		user.shareMeme(meme, feed);
		User user1 = new User();
		Meme meme1 = meme;
		user1.shareMeme(meme1, feed1);
		
		String allMemes = "";
		assertEquals(allMemes, feed2.toString());
		
		assertEquals(feed.toString(), feed1.toString());
		
	}
	
	@Test
	/**
	 * tests getNewMemeTest for correct return of meme if not null
	 */
	public void getNewMemeTest() {
		Meme meme = new Meme();
		User user = new User();
		Feed feed = new Feed();
		feed.getMemes().add(meme);
		feed.getNewMeme(user);
		assertEquals(meme, feed.getNewMeme(user));
		
		user.getMemesViewed().add(meme);
		user.getMemesCreated().add(meme);
		assertEquals(null, feed.getNewMeme(user));

	}
	
	@Test
	/**
	 * tests getMemes and setMemes for correct return memes and void, respectively
	 */
	public void getAndSetMemes() {
		Feed feed = new Feed();
		feed.setMemes(memes);
		assertEquals(memes, feed.getMemes());
	}
	
}
