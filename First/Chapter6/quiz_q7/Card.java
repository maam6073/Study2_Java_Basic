package quiz_q7;

public class Card 
{
	private static int serialNum = 10000; 
	int CardSerialNum;
	
	Card()
	{
		serialNum++;
		this.CardSerialNum = serialNum; 
	}
	
	public int getCardNum()
	{
		return CardSerialNum;
	}
}
