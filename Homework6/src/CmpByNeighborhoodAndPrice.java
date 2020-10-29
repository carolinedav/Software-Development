import java.util.Comparator;
/**
 * 
 * @author Caroline Davis (cnd7cy)
 * WAY #3: sorting first by the neighborhood (ascending order)
 * 			then by price (highest -> lowest)
 *
 */
public class CmpByNeighborhoodAndPrice implements Comparator<Willow>{
	/**
	 * compare takes in two properties and sorts by Way #3 
	 */
	public int compare(Willow p1, Willow p2) {
		//WAY 3: first by neighborhood, then by price
		int retVal = p1.getNeighborhood().compareTo(p2.getNeighborhood());
		if(retVal != 0)
			return retVal;
		return (int) ((p2.getPrice()) - (p1.getPrice()));
		
	}
}
