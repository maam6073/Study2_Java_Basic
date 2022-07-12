package quiz_q2;

public class Quiz_Q2 {

	public static void main(String[] args) 
	{
		char[] alpabetarr;
		alpabetarr = new char[52];
		char alpabet = 97;
		
		for(int i = 0; i < alpabetarr.length; i++)
		{
			if(i == 26) alpabet = 65;
			
			alpabetarr[i] = alpabet;
			alpabet++;
			System.out.println(alpabetarr[i]);
		}

	}

}
