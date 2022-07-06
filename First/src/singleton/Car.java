package singleton;

public class Car 
{
	private static int serial = 10000;
	int CarNum;
	String CarName;
	
	
	Car()
	{
		serial ++;
		this.CarNum = serial;
	}
	
	public int getCarNum()
	{
		return CarNum;
	}
	
}
