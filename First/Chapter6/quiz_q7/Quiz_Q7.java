package quiz_q7;

public class Quiz_Q7 {

	public static void main(String[] args) 
	{
		CardCompany company = CardCompany.getCardCampany();
		
		Card myCard1 = company.createCard();
		Card myCard2 = company.createCard();
		
		System.out.println(myCard1.getCardNum());
		System.out.println(myCard2.getCardNum());
	}

}
