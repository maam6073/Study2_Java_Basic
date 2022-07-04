package classpart;

public class Quiz01
{
	String PersonName;
	int PersonAge;
	int ChildrenNum;
	boolean isMarried;
	
	
	public void getPersonInfo()
	{
		System.out.println("이름: "+PersonName);
		System.out.println("나이: "+PersonAge);
		System.out.println("자식 수: "+ChildrenNum);
		System.out.println("결혼 여부: "+isMarried);
	}
	
	
	
	public static void main(String[] args)
	{
		Quiz01 person1 = new Quiz01();
		person1.PersonName = "James";
		person1.PersonAge = 40;
		person1.ChildrenNum = 3;
		person1.isMarried = true;
		person1.getPersonInfo();
	}

}
