package classpart;

public class FunctionTest 
{
	public static void main(String[] args)
	{
		int num1 = 10;
		int num2 = 20;
		
		int sum = add(num1,num2);
		int sub = sub(num1,num2);
		int mul = mul(num1,num2);
		int div = div(num1,num2);
		//System.out.println(num1 + " + " + num2 + " = " + sum +"입니다.");
	}
	
	public static int add(int n1, int n2)
	{
		int result = n1 + n2;
		System.out.println(n1 + " + " + n2 + " = " + result +"입니다.");
		return result;	//결과값 반환
	}
	
	public static int sub(int n1,int n2)
	{
		int result = n1 - n2;
		System.out.println(n1 + " - " + n2 + " = " + result +"입니다.");
		return result;
	}
	
	public static int mul(int n1, int n2)
	{
		int result = n1 * n2;
		System.out.println(n1 + " * " + n2 + " = " + result +"입니다.");
		return result;
	}
	
	public static int div(int n1, int n2)
	{
		int result = n1 / n2;
		System.out.println(n1 + " / " + n2 + " = " + result +"입니다.");
		return result;
	}
}
