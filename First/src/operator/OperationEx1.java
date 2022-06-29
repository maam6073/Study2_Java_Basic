package operator;

public class OperationEx1 {

	public static void main(String[] args)
	{
		int korScore = 97;
		int mathScore = 90;
		int engScore = 70;
		
		int totalScore = mathScore + engScore + korScore;
		System.out.println("총점: "+totalScore + "점");
		
		double avgScore = totalScore / 3.0;
		System.out.format("평균: %.2f점",avgScore);
		
	}

}
