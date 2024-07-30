package New;

public class demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Address addr = new Address();
		addr.setFlatno("p1-23");
		addr.setSocietyname("xyz");
		addr.setArea("abc");
		addr.setPincode(380007);

		Person p1 = new Person();
		p1.setPname("Heli");
		p1.setPemail("hi@gmail.com");
		p1.setAddr(addr);
		//injecting object of address class to person class
		//dependecy injection
		System.out.println(p1);
	}

}
