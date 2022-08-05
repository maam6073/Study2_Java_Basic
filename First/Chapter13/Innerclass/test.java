package Innerclass;

public class test {

	public static void main(String[] args) {
		int result = 100;
		int num = 4;
		int count = 0;
		
		while(result >= 8)
		{
			result = result-num;
			count = count+1;
		}
		System.out.print(count);
	}
}
