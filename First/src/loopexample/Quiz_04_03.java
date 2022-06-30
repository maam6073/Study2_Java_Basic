package loopexample;

public class Quiz_04_03 {

	public static void main(String[] args)
	{
		for(int times = 1; times <= 9; times++)
		{
			for(int dan = 2; dan <=9; dan++)
			{
				if(dan > times) 
					break;
				System.out.print(times+"X"+dan+"="+dan*times + " ");
			}
			System.out.println("");
		}

	}

}
