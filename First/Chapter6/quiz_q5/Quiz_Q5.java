package quiz_q5;

public class Quiz_Q5 {

	public static void main(String[] args)
	{
		Person personKim = new Person("김씨",10000);
		Person personLee = new Person("이씨",7000);
		
		Cafe cafe1 = new Cafe("별다방","아메리카노",4000);
		Cafe cafe2 = new Cafe("콩다방","라떼",4500);
		
		personKim.Buy(cafe1);
		cafe1.Sell();
		personKim.showInfo();
		cafe1.showInfo();
		
		personLee.Buy(cafe2);
		cafe2.Sell();
		personLee.showInfo();
		cafe2.showInfo();
		
	
	}

}
