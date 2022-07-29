package quiz_q6;

import java.util.HashMap;


public class CarFactory
{
	static CarFactory inst;
	private HashMap<String,Car> hashMapCar = new HashMap<String,Car>();
	int key;
	String carName;
	

	public static CarFactory getInstance()
	{
		if(inst == null)
		{
			inst = new CarFactory();
		}
		return inst;
	}
	
	public Car createCar(String carName)
	{
		Car car = null;
		if(!hashMapCar.containsKey(carName))
		{
			hashMapCar.put(carName, new Car(carName));
		}
		return car;
	}
}