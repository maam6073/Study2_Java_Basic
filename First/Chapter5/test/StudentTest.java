package test;

import hiding.Student;

public class StudentTest 
{
	public static void main(String[] args)
	{
		Student studentLee = new Student();
		studentLee.studentName = "김도형";
		studentLee.setStudentName("김도형");
		System.out.println(studentLee.getStudentName());
		
	}
}
