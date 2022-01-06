package a;

class CustEnitity {

	static Customer getCustomer(Customer cust) {
		Customer c = new Customer();
		c.setName(cust.getName());
		c.setId(cust.getId());
		return c;

	}

	public static void main(String[] args) {

		Customer cf = new Customer();
		cf.setId(11);
		cf.setName("aaa");
		Customer cf2 = new Customer();
		cf2.setId(111);
		cf2.setName("aaaaa");

		Customer t = getCustomer(cf);
		System.out.println(t.getId() + "  " + t.getName());
		t = getCustomer(cf2);
		System.out.println(t.getId() + "  " + t.getName());

	}

}
