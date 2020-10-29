import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;
/**
 * 
 * @author Caroline Davis (cnd7cy)
 * RatingTest is the JUnit Test Case for the Rating class
 */

public class RatingTest {

	private int score;
	private User user; 
	
	@Before
	/**
	 * tests the Rating constructor for correct declaration/instantiation
	 */
	public void ratingConstructorTest() {
		User user1 = new User();
		user1.setUserName("cnd7cy");
		int score = 1;
		Rating rating = new Rating(user1, score);
		assertTrue(rating.getScore() == score);
		assertEquals(rating.getUser(), user1);
		
	}
	
	
	@Test
	/**
	 * tests toString for correct return of String value
	 */
	public void toStringTest() {
		Rating rating = new Rating();
		Rating rating1 = new Rating();
		rating.setScore(1);
		rating1.setScore(1);
		
		assertEquals(rating.toString(), rating1.toString());
	}
	
	@Test
	/**
	 * tests equals method for correct return of boolean value if score and user are equal
	 */
	public void equalsTest() {
		Rating rating1 = null;
		User user = new User();
		Rating rating2 = new Rating(user, 0);
		Rating rating3 = new Rating();
		Rating rating4 = rating2;
		rating3.setScore(1);
		rating4.setScore(0);
		
		assertFalse(rating2.equals(rating1));
		assertFalse(rating2.equals(user));
		assertTrue(rating2.equals(rating4));
		assertFalse(rating2.equals(rating3));
	}
	
	@Test
	/**
	 * tests getScore and setScore for correct return score and void, respectively
	 */
	public void getAndSetScore() {
		Rating rating = new Rating();
		Rating rating2 = new Rating();
		rating.setScore(0);
		rating2.setScore(1);
		
		assertTrue(rating.getScore() == -1);
	}
	
	@Test
	/**
	 * tests getUser and setUser for correct return user and void, respectively
	 */
	public void getAndSetUser() {
		Rating rating = new Rating();
		rating.setUser(user);
		assertEquals(user, rating.getUser());
	}

}
