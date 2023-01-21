package Class.Interface;

public class Interface_Phone {

	public static void main(String[] args) {
		MycellPhone p1 = new MycellPhone();
		Camera p2 = new MycellPhone();
		Call p3 = new MycellPhone();
		Memo p4 = new MycellPhone();
		PhoneUser user1 = new PhoneUser();
		user1.call(p1); // 가능
//		user1.call(p2); 오류
//		user1.call(p3);
//		user1.call(p4);
	}

}                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                  

interface Camera{
	void photo();
}

interface Call{
	void calling();
}

interface Memo{
	void memo();
}

interface Clock{
	void clock();
}

class MycellPhone implements Camera,Call,Memo,Clock{ //한번에 구현가능

	@Override
	public void clock() {
		System.out.println("Clock");
	}

	@Override
	public void memo() {
		System.out.println("memo");
	}

	@Override
	public void calling() {
		System.out.println("calling");
	}

	@Override
	public void photo() {
		System.out.println("photo");
	}
	
}

class PhoneUser{
	
	void call(Call c) {
		System.out.println("전화를 걸었습니다");
	}
}