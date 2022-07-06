package statices;

public class Student3 
{
 static	int SerialNum = 1000;
 int studentID;
 String studentName;
 int studentCardNum;

 Student3()
 {
	 SerialNum ++;
	 studentID = SerialNum;
	 studentCardNum = studentID + 100;
 }
 
 public String getStudentName() 
 {
	return studentName; 
 }
 
 public void setStudentName(String studentName)
 {
	 this.studentName = studentName;
 }
}
