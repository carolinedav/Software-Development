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
		imageFileName = "";
		title = "";
		description = "";
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
	* toString : @return String title & description
	*/
	public String toString() {
		return  title + " <" + description + ">";
	}
	
	/**
	* equals : @return boolean | return true if title, description, imageFileName all match
	*/
	public boolean equals(Object o) {
		if (o == null)
			return false;
		if (getClass() != o.getClass())
			return false;
		if(this == o)
			return true;
		
		BackgroundImage other = (BackgroundImage) o;
		return(description.equals(other.description) && imageFileName.equals(other.imageFileName) && title.equals(other.title));
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
