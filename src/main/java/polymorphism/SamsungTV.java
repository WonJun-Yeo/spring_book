package polymorphism;

public class SamsungTV implements TV {

//	public void powerOn() {
//		System.out.println("SamsungTv---전원 켠다.");
//	}
//	public void powerOff() {
//		System.out.println("SamsungTv---전원 끈다.");
//	}
//	public void volumeUp() {
//		System.out.println("SamsungTv---소리를 올린다.");
//	}
//	public void volumeDown() {
//		System.out.println("SamsungTv---소리를 내린다.");
//	}
	
	// 다형성을 이용한 결합도 낮추기

	@Override
	public void powerOn() {
		System.out.println("SamsungTv---전원 켠다.");
	}

	@Override
	public void powerOff() {
		System.out.println("SamsungTv---전원 끈다.");
	}

	@Override
	public void volumeUp() {
		System.out.println("SamsungTv---소리를 올린다.");
	}

	@Override
	public void volumeDown() {
		System.out.println("SamsungTv---소리를 내린다.");
	}
	
	// 기본생성자
	public SamsungTV() {
		System.out.println("===> SamsungTV 객체 생성");
	}
	
	// init-method로 초기화할 메서드
	public void initMethod() {
		System.out.println("객체 초기화 작업 처리..");
	}
	
	// destroy-method로 객체가 삭제되기 전 실행될 메서드
	public void destroyMethod() {
		System.out.println("객체 삭제 전 처리할 로직 처리...");
	}
}
