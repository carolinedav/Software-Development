import java.util.*;

/**
* 
* @author Caroline Davis (cnd7cy)
*  09/18/2020
*  BackgroundImage class, used to create a background image for meme creation
*  
**/

public class BackgroundImage {
	private String imageFileName;
	private String title;
	private String description;
	
	/**
	* empty constructor
	*/
	public BackgroundImage() {
		
	}
	/**
	* constructor : initializes each variable of class BackgroundImage
	*/
	public BackgroundImage(String imageFileName, String title, String description) {
		this.imageFileName = imageFileName;
		this.title = title;
		this.description = description;
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
	* equals : @return boolean
	*/
	public boolean equals(BackgroundImage backgroundimage) {
		/** STUB/TODO : determines equality **/
		return true;
	}
	
	
	
	
	
	/**
	* getImageFileName : @return imageFileName
	*/
	public String getImageFileName() {
		return imageFileName;
	}
	/**
	* setImageFileName : @return void
	*/
	public void setImageFileName(String imageFileName) {
		this.imageFileName = imageFileName;
	}
	
	
	/**
	* getTitle : @return title
	*/
	public String getTitle() {
		return title;
	}
	/**
	* setTitle : @return void
	*/
	public void setTitle(String title) {
		this.title = title;
	}

	
	/**
	* getDescription : @return description
	*/
	public String getDescription() {
		return description;
	}
	/**
	* setDescription : @return void
	*/
	public void setDescription(String description) {
		this.description = description;
	}
	
	
}
