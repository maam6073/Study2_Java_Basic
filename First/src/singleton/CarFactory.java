package singleton;

public class CarFactory 
{
	static int sirialNum = 10000;
	int CarID;
	private static CarFactory instance = new CarFactory();
	private CarFactory() {}
	
	public static CarFactory getInstance()
	{
		if(instance == null)
		{
			instance = new CarFactory();
		}
		return instance;
	}
	
//	public Car createCar()
//	{
//		sirialNum ++;
//		
//	}

}
