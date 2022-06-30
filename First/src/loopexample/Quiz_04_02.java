package loopexample;

public class Quiz_04_02 {

	public static void main(String[] args)
	{
		for(int i = 1; i<=9; i++)
		{
			for(int j = 2; j<=9; j++)
			{
				if(j % 2!=0)
					continue;
				System.out.print(j +"X"+ i + "= " + j * i + "  ");
			}
			System.out.println("");
		}
	}
}
