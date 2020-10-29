import java.util.ArrayList;
import java.util.Collections;
/**
 * 
 * @author Caroline Davis (cnd7cy)
 * Willow defines a real-estate property object
 */
public class Willow implements Comparable<Willow>{
	String neighborhood;
	int bedrooms;
	boolean garage;
	double distToCenter;
	double price;
	/**
	 * Willow constructor: takes in String neighborhood, int bedrooms, boolean garage, double distToCenter, double price
	 */
	public Willow(String neighborhood, int bedrooms, boolean garage, double distToCenter, double price) {
		this.neighborhood = neighborhood;
		this.bedrooms = bedrooms;
		this.garage = garage;
		this.distToCenter = distToCenter;
		this.price = price;
		
	}
	
	/** main method testing
	 * 
	public static void main(String[] args) {
		Willow p1 = new Willow("JPA", 5, true, 1.0, 2495.0);
		Willow p2 = new Willow("JPA", 4, false, 0.7, 1000.0);
		p1.compareTo(p2);
		
		Willow p3 = new Willow("JPA", 3, false, 0.7, 1000.0);
		Willow p4 = new Willow("JPA", 4, true, 1.0, 2954.0);
		p3.compareTo(p4);
		
	}
	*/
	
	/**
	 * compareTo : overrides compareTo method; represents "natural ordering of properties" 
	 */
	@Override
	public int compareTo(Willow p2) {
		if(this.getPrice() > p2.getPrice())
			return 1;
		else if(this.getPrice() < p2.getPrice())
			return -1;
		if(this.getDistToCenter() > p2.getDistToCenter())
			return 1;
		else if(this.getDistToCenter() < p2.getDistToCenter())
			return -1;
		return 0;
	}
	/**
	 * 
	 * @param pList; calls Collection.sort() to sort using compareTo() method
	 */
	public static void sortByNaturalOrdering(ArrayList<Willow> pList) {
		Collections.sort(pList);
	}
	/**
	 * 
	 * @param pList; calls Collection.sort() to sort using compare() method in CmpByBedroomsAndGarage class
	 */
	public static void sortByBedroomsAndGarage(ArrayList<Willow> pList) {
		Collections.sort(pList, new CmpByBedroomsAndGarage());
	}
	/**
	 * 
	 * @param pList; calls Collection.sort() to sort using compare() method in CmpByNeighborhoodAndPrice class
	 */
	public static void sortByNeighborhoodAndPrice(ArrayList<Willow> pList) {
		Collections.sort(pList, new CmpByNeighborhoodAndPrice());
	}
	
	@Override
	/**
	 * toString() method prints the neighborhood, number of bedrooms, garage, distance to the center, and the price
	 */
	public String toString() {
		return "[" + this.neighborhood + "|" + this.bedrooms + "|" + this.garage + "|" + this.distToCenter + "|" + this.price + "]";
	}

	
	/**
	 * @return the neighborhood; getter method 
	 */
	public String getNeighborhood() {
		return neighborhood;
	}
	/**
	 * sets the neighborhood; setter method 
	 */
	public void setNeighborhood(String neighborhood) {
		this.neighborhood = neighborhood;
	}
	/**
	 * @return the number of bedrooms; getter method 
	 */
	public int getBedrooms() {
		return bedrooms;
	}
	/**
	 * sets the number of bedrooms; setter method 
	 */
	public void setBedrooms(int bedrooms) {
		this.bedrooms = bedrooms;
	}
	/**
	 * @return if there is a garage; getter method 
	 */
	public boolean getGarage() {
		return garage;
	}
	/**
	 * @return sets the boolean of garage; setter method 
	 */
	public void setGarage(boolean garage) {
		this.garage = garage;
	}
	/**
	 * @return distance to campus; getter method 
	 */
	public double getDistToCenter() {
		return distToCenter;
	}
	/**
	 * sets distance to campus; setter method 
	 */
	public void setDistToCenter(double distToCenter) {
		this.distToCenter = distToCenter;
	}
	/**
	 * @return price; getter method 
	 */
	public double getPrice() {
		return price;
	}
	/**
	 * sets price; setter method 
	 */
	public void setPrice(double price) {
		this.price = price;
	}
	
	
}
