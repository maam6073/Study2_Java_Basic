package finalex;

public class Constant{

	int num = 10;
	final int NUM = 100;
	
	public static void main(String[] args) 
	{
		Constant con = new Constant();
		
		con.num = 11;
		//con.NUM = 11;
		
		System.out.println(con.num);
		System.out.println(con.NUM);
	}

}
