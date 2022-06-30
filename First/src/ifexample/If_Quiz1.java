package ifexample;

public class If_Quiz1 {

	public static void main(String[] args) 
	{
		int score = -1;
		char grade ='N';
		
		if(score >= 90 && score <= 100)
		{
			grade = 'A';
		}
		else if(score >= 80 && score <= 89)
		{
			grade = 'B';
		}
		else if(score >= 70 && score <= 79)
		{
			grade = 'C';
		}
		else if(score >= 60 && score <= 69)
		{
			grade = 'D';
		}
		else if(score >= 0 && score <= 59)
		{
			grade = 'F';
		}
		else
		{
			System.out.println("잘못된 성적입니다.");
			grade = 'N';
		}
		
		if(grade != 'N')
		System.out.println("시험성적은 " + score+"점 이므로 " +"학점은 \"" +grade+"\" 입니다.");
	}
}
