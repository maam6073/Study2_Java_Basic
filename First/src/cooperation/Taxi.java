package cooperation;

public class Taxi 
{
	String TaxiNumber;
	int passengerCount;
	int money;

	Taxi(String TaxiName)
	{
		this.TaxiNumber = TaxiName;
	}
	
	public void take(int money)
	{
		this.money += money;
		passengerCount += 1;
	}
	
	public void showInfo()
	{
		System.out.println("택시"+TaxiNumber+"의 승객은"+passengerCount+"명이고,"+"수입은"+this.money+"입니다.");
	}
}
