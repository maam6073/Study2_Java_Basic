package quiz_q7;

public class CardCompany 
{
	private static CardCompany instance = new CardCompany();
	private CardCompany(){ }
	
	
	public static CardCompany getCardCampany()
	{
		if(instance == null)
		{
			instance = new CardCompany();
		}
		return instance;
	}
	
	
	public Card createCard()
	{
		Card card = new Card();
		return card;
	}
}
