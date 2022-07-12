package array;

public class Student 
{
	int studentID;
	String name;
	
	Student(int id, String name)
	{
		this.studentID = id;
		this.name = name;
	}
	
	public void showStudentInfo()
	{
		System.out.println(studentID+","+name);
	}
}
