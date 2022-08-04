package exception;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class ExceptionHandling1 {

	public static void main(String[] args) {
		try {
			FileInputStream fis = new FileInputStream("a.txt");
			try{
				fis.close();
			}catch(IOException e)
			{
				e.printStackTrace();
			}
		} catch (FileNotFoundException e) {
			System.out.println(e);
		}
		System.out.println("여기도 수행됩니다.");
	}
}
