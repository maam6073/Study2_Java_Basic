package singleton;

public class Car 
{
	int CarID;
	String CarName;
	
	
	Car()
	{
		//this.CarID = CarFactory.getInstance().createCar();
	}
	
	public int getCarNum()
	{
		return CarID;
	}
	
}
