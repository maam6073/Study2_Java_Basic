package object;


class MyDate
{
	int day;
	int month;
	int year;
	int num;
	
	public MyDate(int day, int month, int year ,int num)
	{
		this.day = day;
		this.month = month;
		this.year = year;
		this.num = num;
	}
	
	@Override
	public boolean equals(Object obj)
	{
		if(obj instanceof MyDate)
		{
			MyDate date = (MyDate)obj;
			if(this.day == date.day && this.month == date.month && this.year == date.year)
			return true;
			else
				return false;
		}
		else
		{
			return false;
		}
	}
	
	@Override
	public int hashCode()
	{
		return num;
	}
}


public class MyDateTest
{
	public static void main(String[] args) {
		MyDate date1 = new MyDate(9,18,2004,1234);
		MyDate date2 = new MyDate(9,18,2004,1234);
		System.out.println(date1.equals(date2));
		System.out.println("date1 hashCode : " + date1.hashCode());
		System.out.println("date2 hashCode : " + date2.hashCode());
		
		System.out.println("date1 hashCode : " + System.identityHashCode(date1));
		System.out.println("date2 hashCode : " + System.identityHashCode(date2));
	}
}