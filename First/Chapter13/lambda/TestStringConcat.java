package lambda;

public class TestStringConcat {

	public static void main(String[] args) {
		
		String s1 = "Hello";
		String s2 = "World";
		//일반추상메서드 실행
//		StringConCatImpl concat1 = new StringConCatImpl();
//		concat1.makeString(s1, s2);
		
		
		//람다식으로 구현
		StringConcat concat2 = (s,v) -> System.out.println(s + "," +v);
		concat2.makeString(s1,s2);
	}
}
