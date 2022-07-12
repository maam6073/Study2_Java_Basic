package array;
import java.util.ArrayList;
public class StudentArrayList {

	public static void main(String[] args)
	{
		ArrayList<Student> studentarr = new ArrayList<Student>();
		
		studentarr.add(new Student(1001,"James"));
		studentarr.add(new Student(1002,"Tomas"));
		studentarr.add(new Student(1003,"Edward"));
		
		for(int i = 0; i < studentarr.size(); i++)
		{
			Student student = studentarr.get(i);
			student.showStudentInfo();
		}
	}
}
