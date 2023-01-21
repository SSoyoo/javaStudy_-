package Class;

public class Annonymous2 {

	public static void main(String[] args) {
		
		Inter1 it = new Inter1(){

			@Override
			public void f1() {
				System.out.println("inter1 imple f1()");
			}
			
			
			
		};
		
		it.f1();	
			
	}

}
interface Inter1{
	void f1();
}
class InterImple implements Inter1{

	@Override
	public void f1() {
		// TODO Auto-generated method stub
		
	}
	
}