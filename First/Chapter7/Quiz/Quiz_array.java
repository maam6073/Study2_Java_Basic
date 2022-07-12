package Quiz;

public class Quiz_array {

	public static void main(String[] args) 
	{
		char[][] alpabet2arr = new char[13][2];
		char alpa = 'a';
		
		for(int i =0; i < alpabet2arr.length; i++)
		{
			for(int j = 0; j < alpabet2arr[i].length; j++)
			{
					alpabet2arr[i][j] = alpa;
					alpa ++;
					System.out.print(alpabet2arr[i][j]);				
			}
			System.out.println();
		}
		
		
//		for(int i =0; i < alpabet2arr.length; i++)
//		{
//			for(int j = 0; j < alpabet2arr[i].length; i++)
//			{
//			}
//		}

		
		}
	}

