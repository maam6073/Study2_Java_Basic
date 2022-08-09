package exception;

public class PasswordFormatTest {
	
	String userPassWord;
	
	public String getPassWord(){
		return userPassWord;
	}
	
	public void setPassWord(String userPassWord)throws PasswordFormatException{
		
		if(userPassWord == null) {
			throw new PasswordFormatException("비밀번호가 null입니다.");
		}else if(userPassWord.length() < 5 && userPassWord.length() > 0) {
			throw new PasswordFormatException("5자 이하입니다.");
		}else if(userPassWord.matches(userPassWord)) {
			throw new PasswordFormatException("문자열로만 이루어져있습니다.");
		}
		this.userPassWord = userPassWord;
	}
	
	public static void main(String[] args) {
		PasswordFormatTest test = new PasswordFormatTest();
		
		
		String password = null;
		try {
			test.setPassWord(password);
		}catch(PasswordFormatException e)
		{
			System.out.println(e.getMessage());
		}
		
		password = "abcdeff";
		try {
			test.setPassWord(password);
		}catch(PasswordFormatException e)
		{
			System.out.println(e.getMessage());
		}

		password = "ab";
		try {
			test.setPassWord(password);
		}catch(PasswordFormatException e)
		{
			System.out.println(e.getMessage());
		}
	}
}
