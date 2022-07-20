package object;

class Book
{
	int bookNumber;
	String bookTitle;
	
	Book(int bookNumber, String bookTitle)
	{
		this.bookNumber = bookNumber;
		this.bookTitle = bookTitle;
	}
	
	@Override
	public String toString()
	{
		return bookTitle + "," +  bookNumber;
	}
}

public class ToStringEx
{
	public static void main(String[] args)
	{
		Book book1 = new Book(200,"개미");
		Student stu1 = new Student("학생1",12345);
		
		System.out.println(book1);
		System.out.println(book1.toString());
		
		System.out.println(stu1);
		System.out.println(stu1.toString());
	}
}
