package dicountApplicable;

public class Discounts {

	// discount on percentage after giving discount on total amount
	public double getApplicableDiscountsBill(UserType usrtype) {

		// discount on every $100 given $5

		double netBill = getDiscountsOnTotalAmount(usrtype.getTotalAmount());

		if (usrtype.getUsrtype().equals("customer")) {
			if (usrtype.getCustomerSince() >= 2.0) {
//		double  billAfterSpecificDiscount = netBill*usrtype.getDiscountPercentage();
//		 billAfterSpecificDiscount= billAfterSpecificDiscount/100.0;
//		 netBill=netBill-billAfterSpecificDiscount;

				netBill = getBillafterDeductionPercentage(netBill, usrtype);
			}

		} else {
			netBill = getBillafterDeductionPercentage(netBill, usrtype);

		}

//		 double discountPercentage = 0;
//		double  billAfterSpecificDiscount = 0;

//		if (usrtype.getUsrtype().equals("employee")) {
//			 discountPercentage = 30;
//			 
//			 billAfterSpecificDiscount = netBill*discountPercentage;
//			 billAfterSpecificDiscount= billAfterSpecificDiscount/100.0;
//			 
//			 netBill=netBill-billAfterSpecificDiscount;
//			
//
//		} else if (usrtype.getUsrtype().equals("affiliate ")) {
//			 discountPercentage = 20;
//
//		}  else if (usrtype.getUsrtype().equals("customer")) {
//			 discountPercentage = 5;
//
//		}else {
//
//			System.out.println("full amt payable");
//		}
//		
		return netBill;

	}

	// discount on every $100 given $5

	private double getDiscountsOnTotalAmount(double totalamount) {

		if (totalamount > 100 || totalamount == 100) {
			int discount = (int) totalamount / 100;
//			System.out.println(5 * discount);
			totalamount = totalamount - (5 * discount);

		}

		return totalamount;
	}

	private double getBillafterDeductionPercentage(double netBill, UserType usrtype) {

		if (usrtype.isGroceriesAmount()) {
			netBill = netBill - usrtype.getGroceriesAmount();
			netBill = getPercentageDeduction(netBill, usrtype);
			netBill = (netBill + usrtype.getGroceriesAmount());

		} else {

			netBill = getPercentageDeduction(netBill, usrtype);
		}

		return netBill;
	}

	private double getPercentageDeduction(double netBill, UserType usrtype) {

		double billAfterSpecificDiscount = netBill * usrtype.getDiscountPercentage();
		billAfterSpecificDiscount = billAfterSpecificDiscount / 100.0;
		netBill = (netBill - billAfterSpecificDiscount); // + usrtype.getGroceriesAmount();

		return netBill;

	}

}
