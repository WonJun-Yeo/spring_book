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
}
