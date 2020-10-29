import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;
/**
 * 
 * @author Caroline Davis (cnd7cy)
 * BackgroundImageTest is the JUnit Test Case for the BackgroundImage class
 */

public class BackgroundImageTest {

	private String imageFileName;
	private String title;
	private String description;
	
	@Before
	/**
	 * tests the BackgroundImage constructor for correct declaration/instantiation
	 */
	public void backgroundImageConstructorTest() {
		imageFileName = "";
		title = "";
		description = "";
		BackgroundImage backgroundImage = new BackgroundImage(imageFileName, title, description);
		backgroundImage.setImageFileName("");
		backgroundImage.setTitle("");
		backgroundImage.setDescription("");
		assertEquals(imageFileName, backgroundImage.getImageFileName());
		assertEquals(title, backgroundImage.getTitle());
		assertEquals(description, backgroundImage.getDescription());
	}
	
	@Test
	/**
	 * tests toString for correct return of String value
	 */
	public void toStringTest() {
		BackgroundImage backgroundImage = new BackgroundImage();
		backgroundImage.setDescription(description);
		backgroundImage.setImageFileName(imageFileName);
		backgroundImage.setTitle(title);
		
		BackgroundImage backgroundImage2 = new BackgroundImage();
		backgroundImage.setDescription(description);
		backgroundImage.setImageFileName(imageFileName);
		backgroundImage.setTitle(title);
		
		assertEquals(backgroundImage.toString(), backgroundImage2.toString());
	}
	
	@Test
	/**
	 * tests equals method for correct return of boolean value if title, description, and imageFileName are equal to another BackgroundImage obj
	 */
	public void equalsTest() {
		BackgroundImage backgroundImageNull = null;
		BackgroundImage backgroundImageClass = new BackgroundImage();
		assertFalse(backgroundImageClass.equals(backgroundImageNull));
		
		BackgroundImage backgroundImagePara = new BackgroundImage(imageFileName, title, description);
		BackgroundImage backgroundImageCopy = backgroundImagePara;
		assertTrue(backgroundImagePara.equals(backgroundImageCopy));
		
		BackgroundImage backgroundImage = new BackgroundImage();
		assertEquals(backgroundImage, new BackgroundImage());
		
		User user = new User();
		assertFalse(backgroundImagePara.equals(user));
		
		assertTrue(backgroundImagePara.getDescription().equals(backgroundImageCopy.getDescription()));
		assertTrue(backgroundImagePara.getImageFileName().equals(backgroundImageCopy.getImageFileName()));
		assertTrue(backgroundImagePara.getTitle().equals(backgroundImageCopy.getTitle()));
	}
	
	@Test
	/**
	 * tests getImageFileName and setImageFileName for correct return imageFileName and void, respectively
	 */
	public void setAndGetImageFileName() {
		BackgroundImage backgroundImage = new BackgroundImage();
		backgroundImage.setImageFileName(imageFileName);
		assertEquals(imageFileName, backgroundImage.getImageFileName());
	}

	@Test
	/**
	 * tests getTitle and setTitle for correct return title and void, respectively
	 */
	public void setAndGetTitle() {
		BackgroundImage backgroundImage = new BackgroundImage();
		backgroundImage.setTitle(title);
		assertEquals(title, backgroundImage.getTitle());
	}
	
	@Test
	/**
	 * tests getDescription and setDescription for correct return description and void, respectively
	 */
	public void setAndGetDescription() {
		BackgroundImage backgroundImage = new BackgroundImage();
		backgroundImage.setDescription(description);
		assertEquals(description, backgroundImage.getDescription());
	}
}
