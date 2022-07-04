package loopexample;

public class Quiz_04_04
{
	public static void main(String[] args)
	{
		
		int a = 4;
		int b = 1;
		int c = 5;
		int d = 3;
		
		for(int i = 1; i <= 7; i++)
		{
			if(i <= 4)
			{
				for(int j = a; j>0; j--)
				{
					System.out.print(" ");
				}
				for(int j = 1; j <= b; j++)
				{
					System.out.print("*");
				}
				b +=2;
				a -=1;
				System.out.println();
			}
			else
			{
				for(int j = 1; j < d; j++)
				{
					System.out.print(" ");
				}
				for(int j = c; j > 0; j--)
				{
					System.out.print("*");
				}
				c -= 2;
				d += 1;
				System.out.println();
			}
			
			
		}
	}
}
