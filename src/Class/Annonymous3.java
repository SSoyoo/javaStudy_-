package Class;

public class Annonymous3 {

	public static void main(String[] args) {
		
		Abstract2 ab= new Abstract2() {
			
			void f3() {
				System.out.println("Abstract extends()");
			}
		};
		ab.f3();
	}
	
}


abstract class Abstract2{
	abstract void f3();
}