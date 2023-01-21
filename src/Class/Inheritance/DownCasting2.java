package Class.Inheritance;

public class DownCasting2 {

	public static void main(String[] args) {
		 
		Animal lion1 = new Lion();//업캐스팅
		Animal rabbit1 = new Rabbit();//업캐스팅
		Animal monkey = new Monkey();//업캐스팅
		ZooKeeper james = new ZooKeeper();
		james.feed(lion1);
	}

}

class Animal{
	void breth() {
		System.out.println("숨쉬기");
	}
}

class Lion extends Animal{
	public String tostring(){
		return "사자";
	}
}
class Rabbit extends Animal{
	public String tostring(){
		return "토끼";
	}
}
class Monkey extends Animal{
	public String tostring(){
		return "원숭이";
	}
}

class ZooKeeper{
	void feed(Animal animal) {
		System.out.println(animal + "에게 먹이주기");
		
	}
}