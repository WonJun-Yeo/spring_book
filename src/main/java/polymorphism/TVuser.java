package polymorphism;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class TVuser {
	public static void main(String[] args) {
		// 1. Samsung을 Lg로 바꿀 경우 대부분의 코드를 변경해야 한다.
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
		
		// 2. interface를 이용한 결합도 낮추기(Lg TV로 변경 시 참조 객체만 변경하면 된다.)
//		TV tv = new SamsungTV();
//		tv.powerOn();
//		tv.volumeUp();
//		tv.volumeDown();
//		tv.powerOff();
		
		// 3. BeanFactory(객체반환 메소드)를 이용한 결합도 낮추기
//		BeanFactory factory = new BeanFactory();
//		TV tv = (TV)factory.getBean(args[0]);
//		tv.powerOn();
//		tv.volumeUp();
//		tv.volumeDown();
//		tv.powerOff();
		
		// Spring 컨테이너를 구동한다.
		AbstractApplicationContext factory = new GenericXmlApplicationContext("applicationContext.xml");
		
		// Spring 컨테이너로부터 필요한 객체를 요청(LookUp) 한다.
		TV tv = (TV)factory.getBean("tv");
		tv.powerOn();
		tv.volumeUp();
		tv.volumeDown();
		tv.powerOff();
		
		// Spring 컨테이너 종효한다.
		factory.close();
		
	}
	
}
