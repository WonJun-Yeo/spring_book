package polymorphism;

public class TVuser {
	public static void main(String[] args) {
//		// Samsung을 Lg로 바꿀 경우 대부분의 코드를 변경해야 한다.
//		SamsungTV tv = new SamsungTV();
//		tv.powerOn();
//		tv.volumeUp();
//		tv.volumeDown();
//		tv.powerOff();
//		
//		LgTV tv = new LgTV();
//		tv.turnOn();
//		tv.soundUp();
//		tv.soundDown();
//		tv.turnOff();
		
		// Lg TV로 변경 시 참조 객체만 변경하면 된다.
		TV tv = new SamsungTV();
		tv.powerOn();
		tv.volumeUp();
		tv.volumeDown();
		tv.powerOff();
		
	}
	
}
