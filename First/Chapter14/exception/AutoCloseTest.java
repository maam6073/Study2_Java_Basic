package exception;

public class AutoCloseTest {

	public static void main(String[] args) {
		AutoCloseObj obj = new AutoCloseObj();
		try(obj){
			throw new Exception(); //강제예외발생
		}catch(Exception e)
		{
			System.out.println("예외부분입니다.");
		}
	}
}
