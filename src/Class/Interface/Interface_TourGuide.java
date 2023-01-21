package Class.Interface;

public class Interface_TourGuide {

	public static void main(String[] args) {
		
		TourGuide guide = new TourGuide();
		
		guide.leisureSports();
		guide.food();
		guide.sighseeing();

	}

}

interface Providable{
	
	void leisureSports();
	void sightseeing();
	void food();
}


class KoreaTour implements Providable{

	@Override
	public void leisureSports() {
		System.out.println("을숙도 에코센터에서 생태체험 투어");
		
		
	}

	@Override
	public void sightseeing() {
		System.out.println("철새도래지 투어");
	}

	@Override
	public void food() {
		System.out.println("회센터 투어");
	}
	
	
}

class JapanTour implements Providable{

	@Override
	public void leisureSports() {
		System.out.println("번지점프 투어");
	}

	@Override
	public void sightseeing() {
		System.out.println("디즈니랜드 투어");
	}

	@Override
	public void food() {
		System.out.println("츠키지 시장 투어");
		
	}
	
	
}

class TourGuide{
	
//private Providable tour = new KoreaTour();
	private Providable tour = new JapanTour();
	
	public void leisureSports() {
		tour.leisureSports();
	}
	
	public void sighseeing() {
		tour.sightseeing();
		
	}
	
	public void food() {
		tour.food();
	}
}