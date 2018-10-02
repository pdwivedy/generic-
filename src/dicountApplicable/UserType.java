package dicountApplicable;

public class UserType {

	// employee , affiliate etc
	private String usrtype;

	private double customerSince;
	private double totalAmount;
	private double discountPercentage;
	private double groceriesAmount;
	private boolean isGroceriesAmount;

// constructor specific for  user type customer only

	public UserType(String usrtype, double customerSince, double totalAmount, double discountPercentage,
			double groceriesAmount, boolean isGroceriesAmount) {
		super();
		this.usrtype = usrtype;
		this.customerSince = customerSince;
		this.totalAmount = totalAmount;
		this.discountPercentage = discountPercentage;
		this.groceriesAmount = groceriesAmount;
		this.isGroceriesAmount = isGroceriesAmount;

	}

	public UserType(String usrtype, double totalAmount, double discountPercentage, double groceriesAmount,
			boolean isGroceriesAmount) {
		super();
		this.usrtype = usrtype;
		this.totalAmount = totalAmount;
		this.discountPercentage = discountPercentage;
		this.groceriesAmount = groceriesAmount;
		this.isGroceriesAmount = isGroceriesAmount;
	}

	public String getUsrtype() {
		return usrtype;
	}

	public double getTotalAmount() {
		return totalAmount;
	}

	public double getCustomerSince() {
		return customerSince;
	}

	public void setCustomerSince(double customerSince) {
		this.customerSince = customerSince;
	}

	public void setTotalAmount(double totalAmount) {
		this.totalAmount = totalAmount;
	}

	public void setUsrtype(String usrtype) {
		this.usrtype = usrtype;
	}

	public double getDiscountPercentage() {
		return discountPercentage;
	}

	public void setDiscountPercentage(double discountPercentage) {
		this.discountPercentage = discountPercentage;
	}

	public double getGroceriesAmount() {
		return groceriesAmount;
	}

	public void setGroceriesAmount(double groceriesAmount) {
		this.groceriesAmount = groceriesAmount;
	}

	public boolean isGroceriesAmount() {
		return isGroceriesAmount;
	}

	public void setGroceriesAmount(boolean isGroceriesAmount) {
		this.isGroceriesAmount = isGroceriesAmount;
	}

}
