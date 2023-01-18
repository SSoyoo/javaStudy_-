package Method.overloading;

public class Overloading {

	public static void main(String[] args) {
		
		sum(1 , 3);
		sum(1.5 , 3.5);
		sum(3,6,6);
		
	}

		static void sum(int x, int y) {
			System.out.println(x+y);
		}
		
		static void sum(double x , double y) {
			System.out.println(x+y);
		}
		
		static void sum(int x, int y, int z)
		{
			System.out.println(x+y+z);
		}
	
	
}
