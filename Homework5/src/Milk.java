
public class Milk extends AmazonProduct {
	final double taxRate = 0.01;
	/**
	 * A Milk is automatically assigned to 
	 * the Produce category
	 * @param price
	 * @param name
	 * @param primeShipping
	 */
	public Milk(double price, String name, boolean prime) {
		super(price, name, CategoryOptions.PRODUCE, prime);
	}
	/**
	 * Calculate the tax on Milk. The tax rate for Milk is 1%
	 */
	@Override
	public double calcTax() {
		return this.getPrice()*taxRate;
	}
	
	@Override
	public boolean isCouponEligible() {
		return true;
	}
}
