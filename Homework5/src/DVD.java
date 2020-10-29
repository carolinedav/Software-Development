
public class DVD extends AmazonProduct{
	final double taxRate = 0.03;
	/**
	 * A DVD is automatically assigned to 
	 * the Entertainment category
	 * @param price
	 * @param name
	 * @param primeShipping
	 */
	public DVD(double price, String name, boolean prime) {
		super(price, name, CategoryOptions.ENTERTAINMENT, prime);
	}
	/**
	 * Calculate the tax on DVDs. The tax rate for DVDs is 3%
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
