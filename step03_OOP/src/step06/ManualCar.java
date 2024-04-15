package step06;

public class ManualCar extends Car {

	@Override
	public void turnOn() {
		System.out.println("Manual : turnOn");
	}

	@Override
	public void drive() {
		System.out.println("Manual : drive");
	}

	@Override
	public void stop() {
		System.out.println("Manual : stop");
	}

	@Override
	public void turnOff() {
		System.out.println("Manual : turnOff");
	}

}
