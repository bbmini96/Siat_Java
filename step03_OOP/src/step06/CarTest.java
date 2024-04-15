package step06;

public class CarTest {

	public static void main(String[] args) {
		Car manualCar = new ManualCar();
		
		// turnOn -> drive -> stop -> turnOff
//		manualCar.turnOn();
//		manualCar.drive();
//		manualCar.stop();
//		manualCar.turnOff();
		manualCar.run();
		
		System.out.println();
		
		Car aiCar = new AICar();
//		aiCar.turnOn();
//		aiCar.drive();
//		aiCar.stop();
//		aiCar.turnOff();
		manualCar.run();
		
		
		
		
		
		
	}

}
