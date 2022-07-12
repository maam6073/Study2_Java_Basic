package array;

public class StudentArray 
{
	public static void main(String[] args)
	{
		Student[] studentarr = new Student[3];
		
		studentarr[0] = new Student(1001,"James");
		studentarr[1] = new Student(1002,"Tomas");
		studentarr[2] = new Student(1003,"Edward");
		
		for(int i = 0; i < studentarr.length; i++)
		{
			studentarr[i].showStudentInfo();
		}
		
	}
}
