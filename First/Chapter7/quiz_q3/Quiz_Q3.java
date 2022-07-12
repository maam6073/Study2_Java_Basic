package quiz_q3;

public class Quiz_Q3 {

	public static void main(String[] args) 
	{
		int[] arrnum = new int[5];
		int n = 0;
		int sum = 0;
		for(int i = 0; i<10; i++)
		{
			if(i %2 == 0)
			{
				arrnum[n] = i;
				n++;
			}
		}
		
		for(int i = 0; i < arrnum.length; i++)
		{
			sum += arrnum[i];
			System.out.println("배열의 값: "+arrnum[i] +"총합계: "+sum);
		}
	}

}
