package polymorphism;

public class LgTV implements TV {
//	public void turnOn() {
//		System.out.println("LgTv---전원 켠다.");
//	}
//	public void turnOff() {
//		System.out.println("LgTv---전원 끈다.");
//	}
//	public void soundUp() {
//		System.out.println("LgTv---소리를 올린다.");
//	}
//	public void soundDown() {
//		System.out.println("LgTv---소리를 내린다.");
//	}
	
	// 다형성을 이용한 결합도 낮추기

	@Override
	public void powerOn() {
		System.out.println("LgTv---전원 켠다.");
	}

	@Override
	public void powerOff() {
		System.out.println("LgTv---전원 끈다.");
	}

	@Override
	public void volumeUp() {
		System.out.println("LgTv---소리를 올린다.");
	}

	@Override
	public void volumeDown() {
		System.out.println("LgTv---소리를 내린다.");
	}
}