package object;

class Student  
{
	String StudentName;
	int StudentId;
	
	public Student(String name,int num)
	{
		StudentName = name;
		StudentId = num;
	}
	
	@Override
	public String toString()
	{
		return StudentName+","+StudentId;
	}
	
	@Override
	public boolean equals(Object obj)
	{
		if(obj instanceof Student)
		{
			Student std = (Student)obj;
			if(this.StudentId == std.StudentId)
				return true;
			else return false;
		}
		return false;
	}
	
	@Override
	public int hashCode()
	{
		return StudentId;
	}
}

public class EqualsTest
{
	public static void main(String[] args)
	{
		Student studentLee = new Student("이상원",100);
		Student studentLee2 = studentLee;
		Student studentSang = new Student("이상원",100);
		
		if(studentLee == studentLee2)
		{
			System.out.println("studentLee와 studentLee2의 주소는 같습니다.");
		}
		else
			System.out.println("studentLee와 studentLee2의 주소는 다릅니다.");
		
		if(studentLee.equals(studentLee2))
			System.out.println("studentLee와 studentLee2는 동일합니다.");
		else
			System.out.println("studentLee와 studentLee2는 동일하지 않습니다.");
		
		if(studentLee == studentSang) //==기호로 비교
		{
			System.out.println("studentLee와 studentSang의 주소는 같습니다.");
		}
		else
			System.out.println("studentLee와 studentSang의 주소는 다릅니다.");
		
		if(studentLee.equals(studentSang))
		{
			System.out.println("studentLee와 studentSang은 동일합니다.");
		}
		else
			System.out.println("studentLee와 studentSang은 동일하지 않습니다.");
		
		
		
		System.out.println("studentLee의 hashCode :"+ studentLee.hashCode());
		System.out.println("studentLee의 hashCode :"+ studentSang.hashCode());
	
		System.out.println("studentLee의 실제 주소값 :"+ System.identityHashCode(studentLee));
		System.out.println("studentLee의 실제 주소값 :"+ System.identityHashCode(studentSang));
	}
}
