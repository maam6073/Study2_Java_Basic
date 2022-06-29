package operator;

public class OperationEx5 
{
	public static void main(String[] args)
	{
		int num = 0B00000101;
		
		System.out.println(num << 2);
		System.out.println(num >> 2);
		System.out.println(num >>> 2);
		
		System.out.println(num);
		
		num = num << 2;
		System.out.println(num);
		
		System.out.println("1: "+0b00000010+"\n2: "+0b00001010 +"\n3: "+0b00001000 +"\n4: "+0b000000101);
	}

}
