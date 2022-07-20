package classpart;

public class Student
{
	int studentId;			//학번
	String studentName;		//학생 이름
	int grade;				//학년
	String address;			//사는 곳
	
	
	
	public String getStudentName()
	{
		return studentName;
	}
	
	public void setStudentName(String StudentName)
	{
		this.studentName = StudentName;
	}
	

	
	public static void main(String[] args)
	{
		Student studentAhn = new Student();	//Student 객체 Class생성
		studentAhn.studentName ="김도형";
		
		System.out.println(studentAhn.studentName);
		System.out.println(studentAhn.getStudentName());
	}
}
