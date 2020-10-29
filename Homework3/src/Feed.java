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
	private ArrayList<Meme> memes;
	
	
	/**
	* empty constructor
	*/
	public Feed() {
		memes = new ArrayList<Meme>();
	}
	
	/**
	* constructor : initializes each variable of class Feed
	*/
	public Feed(ArrayList<Meme> memes) {
		this.memes = memes;
	}
	
	/**public static void main(String [] args) {
		// create Feed object to house shared memes
		Feed feed = new Feed();
		
		//creation of three users
		User cnd7cy = new User("Caroline", new ArrayList<Meme>(), new ArrayList<Meme>());
		User mjn2pfz = new User("Mateo", new ArrayList<Meme>(), new ArrayList<Meme>());
		User mcj9ax = new User("Maia", new ArrayList<Meme>(), new ArrayList<Meme>());
		
		// creation of BackgroundImages
		BackgroundImage blackBackground = new BackgroundImage("blackScreen", "sadness", "Black Background");
		BackgroundImage redBackground = new BackgroundImage("redScreen", "anger", "Red Background");
		BackgroundImage blueBackground = new BackgroundImage("blueScreen", "sadness pt. 2", "Blue Background");
		
		
		// creation of three memes per user 
		
		//cnd7cy
		Meme cnd7cyMemeA = cnd7cy.createMeme(blackBackground, "When Web Cat crashes");
		Meme cnd7cyMemeB = cnd7cy.createMeme(redBackground, "When CAT throws more errors");
		Meme cnd7cyMemeC = cnd7cy.createMeme(blueBackground, "When you think you understand the lab but you don't");
		ArrayList<Meme> memes = new ArrayList<>();
		memes.add(cnd7cyMemeA);
		memes.add(cnd7cyMemeB);
		memes.add(cnd7cyMemeC);
		
		// sharing the memes to the Feed
		Feed cnd7cyFeed = new Feed(memes);
		cnd7cy.shareMeme(cnd7cyMemeA, cnd7cyFeed);
		cnd7cy.shareMeme(cnd7cyMemeB, cnd7cyFeed);
		cnd7cy.shareMeme(cnd7cyMemeC, cnd7cyFeed);
		
		
		//mjn2pfz
		Meme mjn2pfzMemeA = mjn2pfz.createMeme(blackBackground, "When you have to take Physics II");
		Meme mjn2pfzMemeB = mjn2pfz.createMeme(redBackground, "When PASCO Capstone freezes");
		Meme mjn2pfzMemeC = mjn2pfz.createMeme(blueBackground, "When you have to complete yet another Post Lab");
		memes = new ArrayList<>();
		memes.add(mjn2pfzMemeA);
		memes.add(mjn2pfzMemeB);
		memes.add(mjn2pfzMemeC);
		
		// sharing the memes to the Feed
		Feed mjn2pfzFeed = new Feed(memes);
		mjn2pfz.shareMeme(mjn2pfzMemeA, mjn2pfzFeed);
		mjn2pfz.shareMeme(mjn2pfzMemeB, mjn2pfzFeed);
		mjn2pfz.shareMeme(mjn2pfzMemeC, mjn2pfzFeed);
		
		//mcj9ax
		Meme mcj9axMemeA = mcj9ax.createMeme(blackBackground, "When you don't understand Physics III");
		Meme mcj9axMemeB = mcj9ax.createMeme(redBackground, "When office hours end early");
		Meme mcj9axMemeC = mcj9ax.createMeme(blueBackground, "When you have to take a physics exam through Zoom University");
		memes = new ArrayList<>();
		memes.add(mcj9axMemeA);
		memes.add(mcj9axMemeB);
		memes.add(mcj9axMemeC);
		
		// sharing the memes to the Feed
		Feed mcj9axFeed = new Feed(memes);
		mcj9ax.shareMeme(mcj9axMemeA, mcj9axFeed);
		mcj9ax.shareMeme(mcj9axMemeB, mcj9axFeed);
		mcj9ax.shareMeme(mcj9axMemeC, mcj9axFeed);
		
		// rate each meme with a randomly-generated score
		int randomScore = (int)(Math.random() * (1 - -1 + 1) + -1);
		System.out.println(randomScore);
		cnd7cy.rateMeme(cnd7cyFeed, randomScore);
		mjn2pfz.rateMeme(mjn2pfzFeed, randomScore);
		mcj9ax.rateMeme(mcj9axFeed, randomScore);
		
		//print out the memes and the users
		System.out.println(cnd7cyFeed.getMemes());
		System.out.println(mjn2pfzFeed.getMemes());
		System.out.println(mcj9axFeed.getMemes());
		System.out.println(cnd7cy);
		System.out.println(mjn2pfz);
		System.out.println(mcj9ax);
		
		
	}
	*/
	
	@Override 
	/**
	* toString : @return String ; returns all the memes in the feed, each Meme on a new line

	*/
	public String toString() {
		String allMemes = "";
		for(Meme meme : memes) {
			allMemes += meme.toString() + "\n";
		}
		return allMemes;
	}
	/**
	* getNewMeme : @return null ; return a Meme from the current Feed that the User has not seen
	*/
	public Meme getNewMeme(User user) {
		for(Meme meme : getMemes()){
			if(!user.getMemesViewed().contains(meme) && !user.getMemesCreated().contains(meme)) 
				
				return meme;
			}
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
