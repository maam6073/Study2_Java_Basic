package statices;

public class StudentTest6 
{
	public static void main(String[] args)
	{
		Student3 studentLee = new Student3();
		Student3 studentKim = new Student3();
		studentLee.setStudentName("이윤지");
		studentKim.setStudentName("김도형");
		
		System.out.println(studentLee.studentName + " 카드번호: "+studentLee.studentCardNum);
		System.out.println(studentKim.studentName + " 카드번호: "+studentKim.studentCardNum);
	}
}
