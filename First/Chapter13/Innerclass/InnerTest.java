package Innerclass;

class OutClass
{
	private int num  = 10;			//외부 클래스 private변수
	private static int sNum = 20;	//외부 클래스 정적 변수	
		
	
	static class InStaticClass{				//정적 내부 클래스
		int inNum = 100;		//정적내부클래스의 인스턴스 변수
		static int sInNum = 200;	//정적내부클래스에 정적 변수 선언.
		
		void inTest()
		{
			System.out.println("InStaticClass inNum = " +inNum+"(내부 클래스의 인스턴스 변수 사용)");
			System.out.println("InStaticClass sInNum = " +sInNum+"(내부 클래스의 정적 변수 사용)");
			System.out.println("OutClass sNum = " + sNum + "(외부 클래스의 정적 변수 사용)");
		}
		
		
		static void sTest()	//정적 메서드 역시 정의 불가능. 오류가 발생하므로 주석 처리함.
		{
			System.out.println("OutClass sNum ="+sNum+"(외부 클래스의 정적 변수 사용)");
			System.out.println("InStaticClass sInNum ="+sInNum+"(내부 클래스의 정적 변수 사용)");
		}
	}
//		public void usingClass()
//		{
//			inClass.inTest();
//		}
}


public class InnerTest {

	public static void main(String[] args)
	{
		OutClass.InStaticClass sInClass = new OutClass.InStaticClass();
		//외부 클래스를 생성하지 않고 바로 정적 내부 클래스 생성가능
		System.out.println("외부 클래스 이용하여 내부 클래스 기능 호출");
		sInClass.inTest();
		
		System.out.println();
		System.out.println("정적 내부 클래스의 정적 메서드 호출");
		OutClass.InStaticClass.sTest();
	}
}
