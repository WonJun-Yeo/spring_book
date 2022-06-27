package polymorphism;

public class SamsungTV implements TV {
	// SnoySpeaker에 의존
	private Speaker speaker;
	private int price;

	@Override
	public void powerOn() {
		System.out.println("SamsungTv---전원 켠다.(가격 : " + price + ")");
	}

	@Override
	public void powerOff() {
		System.out.println("SamsungTv---전원 끈다.");
	}
	
	
	@Override
	public void volumeUp() {
		speaker.volumeUp();
	}

	@Override
	public void volumeDown() {
		speaker.volumeDown();
	}
	
	// 기본생성자
	public SamsungTV() {
		System.out.println("===> SamsungTV 객체 생성");
	}
	
	public SamsungTV(Speaker spaeker) {
		System.out.println("===> SamsungTV(2) 객체 생성");
		this.speaker = spaeker;
	}
	
	public SamsungTV(Speaker spaeker, int price) {
		System.out.println("===> SamsungTV(3) 객체 생성");
		this.speaker = spaeker;
		this.price = price;
	}
	
	// init-method로 초기화할 메서드
	public void initMethod() {
		System.out.println("객체 초기화 작업 처리..");
	}
	
	public void setSpeaker(Speaker speaker) {
		System.out.println("===> setSpeaker() 호출");
		this.speaker = speaker;
	}

	public void setPrice(int price) {
		System.out.println("===> setPrice() 호출");
		this.price = price;
	}

	// destroy-method로 객체가 삭제되기 전 실행될 메서드
	public void destroyMethod() {
		System.out.println("객체 삭제 전 처리할 로직 처리...");
	}

}
