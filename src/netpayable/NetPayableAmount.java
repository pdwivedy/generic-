package netpayable;

import dicountApplicable.Discounts;
import dicountApplicable.UserType;

public class NetPayableAmount {

	public static void main(String[] args) {

		Discounts dsc = new Discounts();

		// customer over two year , do have purchase groceries
		UserType customer1 = new UserType("customer", 2.0, 100.00, 5.0, 25.00, true);

		// customer over two year , do not purchase groceries
		UserType customer3 = new UserType("customer", 2.0, 100.00, 5.0, 25.00, false);

		// customer not yet over two year ,do have purchase groceries
		UserType customer2 = new UserType("customer", 1.0, 100.00, 5.0, 25.00, true);

		// customer not yet over two year ,do not purchase groceries
		UserType customer4 = new UserType("customer", 1.0, 100.00, 5.0, 25.00, false);

		// affiliate ,do not purchase groceries
		UserType affiliate1 = new UserType("affiliate", 102.3, 10.0, 0, false);

		// affiliate ,do purchase groceries
		UserType affiliate2 = new UserType("affiliate", 102.3, 10.0, 10, true);

// employee ,do not purchase groceries
		UserType employee1 = new UserType("employee", 101.19, 30.0, 0, false);

		// employee ,do not purchase groceries
		UserType employee2 = new UserType("employee", 101.19, 30.0, 20, true);

		// outputs

		// customer output Net bill
		System.out.println("customer1 Net Bill ->>>>>" + dsc.getApplicableDiscountsBill(customer1));
		System.out.println("customer3 Net Bill ->>>>>" + dsc.getApplicableDiscountsBill(customer3));

		System.out.println("customer2 Net Bill ->>>>>" + dsc.getApplicableDiscountsBill(customer2));
		System.out.println("customer4 Net Bill ->>>>>" + dsc.getApplicableDiscountsBill(customer4));

//affiliate output Net bill
		System.out.println("affiliate1 Net Bill ->>>>>" + dsc.getApplicableDiscountsBill(affiliate1));
		System.out.println("affiliate2 Net Bill ->>>>>" + dsc.getApplicableDiscountsBill(affiliate2));

		// employee output Net bill
		System.out.println("employee1 Net Bill ->>>>>" + dsc.getApplicableDiscountsBill(employee1));
		System.out.println("employee2 Net Bill ->>>>>" + dsc.getApplicableDiscountsBill(employee2));

//		System.out.println(dsc.getDiscountsOnTotalAmount(100.0));

	}

}
