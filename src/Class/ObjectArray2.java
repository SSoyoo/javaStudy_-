package Class;

public class ObjectArray2 {

	public static void main(String[] args) {
		
		Animals[] animal = new Animals[3];
		
		animal[0] = new Animals();
		animal[1] = new Animals();
		animal[2] = new Animals();
		
		animal[0].kind = "고양이";
		animal[0].name = "데지";
		animal[0].age = 3;
		animal[0].showInfo();
		
		animal[1].kind = "개";
		animal[1].name = "뽀삐";
		animal[1].age = 10	;
		animal[1].showInfo();
		
		animal[2].kind = "고양이";
		animal[2].name = "치즈";
		animal[2].age = 1;
		animal[2].showInfo();
		
		

	}

}

class Animals{
	
	String kind;
	String name;
	int age;
	
	void showInfo() {
		
		System.out.println("종류: "+ kind);
		System.out.println("이름: " + name);
		System.out.println("나이: "+ age +"살");
		System.out.println();
		
	}
}