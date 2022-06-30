package loopexample;

public class Quiz_04_04
{
	public static void main(String[] args)
	{
		int count = 7;
		int num = 0;
		
		for(int i = 1; i<= count; i++)
		{
			
				for(int k =count-4; k>=num; k--)
				{
					System.out.print(" ");					
				}
				num++;
				
				for(int j = 1; j<=i; j++)
				{
					if(i % 2 == 0)
						continue;
					System.out.print("* ");
				}
			
			if(i % 2 != 0)
				System.out.println();
		}
		
		//test
//		for(int i = 1; i<=9; i++)
//		{
//			for(int j = 9; j > count; j--)
//			{
//				System.out.print("*");				
//			}
//			System.out.println();
//			count ++;
//		}
	}
}
