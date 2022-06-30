package loopexample;

public class Quiz_04_01 {

	public static void main(String[] args)
	{
		int num1 = 10;
		int num2 = 2;
		char operator = '+';
		int result = 0;
		//If문
		if(operator == '+')
			result = num1+num2;
		else if(operator == '-')
			result = num1-num2;
		else if(operator == '*')
			result = num1*num2;
		else if(operator == '/')
			result = num1/num2;
		
		//Switch문
		switch(operator)
		{
			case '+':
				result = num1+num2;
				break;
			case '-':
				result = num1-num2;
				break;
			case '*':
				result = num1*num2;
				break;
			case '/':
				result = num1/num2;
				break;
		}
		
		System.out.println(num1 + "" + operator + "" + num2 +"=" + result);
	}
}
