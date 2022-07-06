package quiz_q6;

public class Quiz_Q6 {

	public static void main(String[] args) 
	{
		Card card1 = new Card();
		card1.setCardName("현대");
		System.out.println("카드이름: "+card1.CardName + "카드고유번호:" + card1.CardSerialNum);
		
		Card card2 = new Card();
		card2.setCardName("삼성");
		System.out.println("카드이름: "+card2.CardName + "카드고유번호:" + card2.CardSerialNum);
		
	}

}
