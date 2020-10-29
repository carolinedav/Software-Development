import static org.junit.Assert.*;

import org.junit.Test;
/**
 * 
 * @author Caroline Davis (cnd7cy)
 * HW6Tests is the JUnit Test Case for HW6
 *
 */
public class HW6Tests {
	String neighborhood;
	int bedrooms;
	boolean garage;
	double distToCenter;
	double price;
	
	@Test
	/**
	 * tests the Willow constructor
	 */
	public void testWillowConstructor() {
		Willow p1 = new Willow("JPA", 3, true, 0.5, 2495.0);
	}
	
	/**
	 * tests the Willow compareTo method: ranking by lowest to highest price
	 */
	@Test 
	public void testCompareToPrice() {
		//higher
		Willow p1 = new Willow("JPA", 5, true, 1.0, 2495.0);
		Willow p2 = new Willow("JPA", 4, false, 0.7, 1000.0);
		assertTrue(1 == p1.compareTo(p2));
		
		//lower 
		Willow p3 = new Willow("JPA", 3, false, 0.7, 1000.0);
		Willow p4 = new Willow("JPA", 4, true, 1.0, 2954.0);
		assertTrue(-1 == p3.compareTo(p4));
	}
	
	/**
	 * tests the Willow compareTo method: ranking by closest to farthest distance
	 */
	@Test 
	public void testCmpToDistToCenter() {
		//higher
		Willow p1 = new Willow("JPA", 3, true, 0.7, 2495.0);
		Willow p2 = new Willow("JPA", 4, false, 0.5, 2495.0);
		assertTrue(1 == p1.compareTo(p2));
		
		//lower
		Willow p3 = new Willow("JPA", 3, true, 0.5, 2495.0);
		Willow p4 = new Willow("JPA", 4, false, 0.7, 2495.0);
		assertTrue(-1 == p3.compareTo(p4));
	}
	
	/**
	 * tests CmpByBedroomsAndGarage compare method: ranking by highest to lowest bedroom number
	 */
	@Test 
	public void testCmpBedrooms() {
		//higher 
		CmpByBedroomsAndGarage test = new CmpByBedroomsAndGarage();
		Willow p1 = new Willow("JPA", 4, false, 0.7, 2495.0);
		Willow p2 = new Willow("JPA", 3, false, 0.7, 2495.0);
		int retVal = p2.getBedrooms() - p1.getBedrooms();
		assertTrue(retVal == test.compare(p1, p2));
		
		//lower 
		Willow p3 = new Willow("JPA", 3, false, 0.7, 2495.0);
		Willow p4 = new Willow("JPA", 4, false, 0.7, 2495.0);
		int retVal2 = p4.getBedrooms() - p3.getBedrooms();
		assertTrue(retVal2 == test.compare(p3, p4));
	}
	
	/**
	 * tests CmpByBedroomsAndGarage compare method: ranking by properties that have a garage over ones that don't 
	 */
	@Test 
	public void testCmpToGarage() {
		//higher
		CmpByBedroomsAndGarage test = new CmpByBedroomsAndGarage();
		Willow p1 = new Willow("JPA", 4, true, 0.5, 2495.0);
		Willow p2 = new Willow("JPA", 4, false, 0.7, 2495.0);
		assertEquals(-1, test.compare(p1, p2));
		
		//lower
		Willow p3 = new Willow("JPA", 4, false, 0.5, 2495.0);
		Willow p4 = new Willow("JPA", 4, true, 0.7, 2495.0);
		assertEquals(1, test.compare(p3, p4));
	}
	
	/**
	 * tests CmpByNeighborhoodAndPrice compare method: ranking by ascending neighborhoods 
	 */
	@Test 
	public void testCmpNeighborhood() {
		//higher
		CmpByNeighborhoodAndPrice test = new CmpByNeighborhoodAndPrice();
		Willow p1 = new Willow("JPA", 3, true, 0.5, 2495.0);
		Willow p2 = new Willow("The Corner", 4, false, 0.7, 1000.0);
		int retVal = p1.getNeighborhood().compareTo(p2.getNeighborhood());
		assertTrue(retVal == test.compare(p1,p2));
		
		//lower
		Willow p3 = new Willow("The Corner", 3, true, 0.5, 2495.0);
		Willow p4 = new Willow("JPA", 4, false, 0.7, 1000.0);
		int retVal2 = p3.getNeighborhood().compareTo(p4.getNeighborhood());
		assertTrue(retVal2 == test.compare(p3,p4));
	}
	
	/**
	 * tests CmpByNeighborhoodAndPrice compare method: ranking by highest to lowest price
	 */
	@Test 
	public void testCmpToPrice() {
		//higher
		CmpByNeighborhoodAndPrice test = new CmpByNeighborhoodAndPrice();
		Willow p1 = new Willow("JPA", 3, true, 0.5, 2495.0);
		Willow p2 = new Willow("JPA", 4, false, 0.7, 1000.0);
		int retVal = (int) (p2.getPrice() - p1.getPrice());
		assertTrue(retVal == test.compare(p1,  p2));
		
		//lower 
		Willow p3 = new Willow("JPA", 3, true, 0.5, 1000.0);
		Willow p4 = new Willow("JPA", 4, false, 0.7, 2495.0);
		int retVal2 = (int) (p4.getPrice() - p3.getPrice());
		assertTrue(retVal2 == test.compare(p3,  p4));
	}
}
