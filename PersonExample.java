
public class PersonExample {
	public static void main(String[] args) {
		Person p1 = new Person("123456-1234567", "mike");
		System.out.println(p1.nation);
		System.out.println(p1.ssn);
		System.out.println(p1.name);
		
//		p1.nation = "USA";
//		p1.ssn = "654321-6543210";
		p1.name = "kate";
	}

}
