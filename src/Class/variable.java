package Class;

public class variable {

	public static void main(String[] args) {
		
		Member m1 = new Member();
		Member m2 = new Member();
		Member m3 = new Member();
		Member m4 = new Member();
		
	//	m1.CenterName = "welcome";
		m1.name = "김철수";
		m1.age = 32;
		m1.gender = "남자";
		
	//	m2.CenterName = "welcome";
		m2.name = "김지은";
		m2.age = 28;
		m2.gender = "여자";
		
	//	m3.CenterName = "welcome";
		m3.name = "이영호";
		m3.age = 39;
		m3.gender = "남자";
		
	//	m4.CenterName = "welcome";
		m4.name = "김정아";
		m4.age = 45;
		m4.gender = "여자";
		
		
		m1.info();
		m2.info();
		m3.info();
		m4.info();

	}

}


class Member{
	
	
	static String CenterName = "Welcome";
	String name;
	int age;
	String gender;
	
	void info() {
		System.out.println("CenterName :" + CenterName);
		System.out.println("name: "+name);
		System.out.println("age: "+age);
		System.out.println("gender: "+gender);
		
	}
	
}