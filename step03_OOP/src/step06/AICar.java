package step06;

public class AICar extends Car {

	@Override
	public void turnOn() {
		System.out.println("AICar : turnOn");
	}

	@Override
	public void drive() {
		System.out.println("AICar : drive");
	}

	@Override
	public void stop() {
		System.out.println("AICar : stop");
	}

	@Override
	public void turnOff() {
		System.out.println("AICar : turnOff");
	}

}
