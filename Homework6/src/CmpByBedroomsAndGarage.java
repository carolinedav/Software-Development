import java.util.Comparator;
/**
 * 
 * @author Caroline Davis (cnd7cy)
 * WAY #2: sorting first by the number of bedrooms (greatest -> smallest)
 * 			then by garage (those that have a garage -> those that do not have a garage
 *
 */
public class CmpByBedroomsAndGarage implements Comparator<Willow> {

	/**
	 * compare takes in two properties and sorts by Way #2 
	 */
	public int compare(Willow p1, Willow p2) {
		// WAY 2: first by numBedrooms, then by garage
		int retVal = p2.getBedrooms() - p1.getBedrooms();
		if(retVal != 0)
			return retVal;
		
		//assigns int values to boolean values for sorting by garage
		if(p1.getGarage() == p2.getGarage())
			return 0;
		else if(p1.getGarage() == false && p2.getGarage() == true)
			return 1;
		else
			return -1;
	}
	
}
