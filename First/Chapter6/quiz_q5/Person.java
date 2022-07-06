package quiz_q5;

public class Person 
{
	String PersonName;
	int Money;
	
	Person(String name,int money)
	{
		this.PersonName = name;
		this.Money = money;
	}
	
	public void Buy(Cafe price)
	{
		Money -= price.getMenuPrice();
	}
	
	public void showInfo()
	{
		System.out.println(PersonName+"님의 남은돈은"+ this.Money+"원 입니다.");
	}
}
