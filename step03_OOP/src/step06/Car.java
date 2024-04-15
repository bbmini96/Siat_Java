package step06;

public abstract class Car {
	
	public abstract void turnOn();
	public abstract void drive();
	public abstract void stop();
	public abstract void turnOff();
	
	// 템플릿 패턴 Template Pattern
	final public void run() {
		turnOn();
		drive();
		stop();
		turnOff();
	}
	
}
