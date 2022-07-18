package step2;

public class CarTest {

	public static void main(String[] args)
	{
		AICar aicar = new AICar();
		ManualCar manualcar = new ManualCar();
		
		aicar.run();
		manualcar.run();
	}

}
