package quiz_q6;

public class Card 
{
	private static int serialNum = 10000; 
	String CardName;
	int CardSerialNum;
	
	Card()
	{
		serialNum++;
		this.CardSerialNum = serialNum; 
	}
	
	public String getCardName()
	{
		return CardName;
	}
	public void setCardName(String name)
	{
		this.CardName = name;
	}
}
