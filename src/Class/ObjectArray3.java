package Class;

public class ObjectArray3 {

	public static void main(String[] args) {
		
		Users[] user = new Users[4];
		
		user[0] = new Users("가길동","01012345678",20,"남자");
		user[1] = new Users("나길동","01011115678",32,"여자");
		user[2] = new Users("다길동","01012225678",27,"남자");
		user[3] = new Users("라길동","01033335678",33,"여자");
		
		for(int i = 0 ; i<4; i++) {
			user[i].showInfo();
		}

	}

}

class Users{
	
	String name;
	String phone;
	int age;
	String gender;
	
	public Users(String name, String phone, int age, String gender) {
	
		this.name = name;
		this.phone = phone;
		this.age = age;
		this.gender = gender;
		
		
		}
	
	void showInfo() {
		
		System.out.println("name: "+ name);
		System.out.println("phone: "+ phone);
		System.out.println("age: "+ age);
		System.out.println("gender: "+ gender);
		System.out.println();
	}
}