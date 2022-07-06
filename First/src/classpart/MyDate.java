package classpart;

public class MyDate 
{
	private int day;
	private int month;
	private int year;
	
	MyDate(int pday,int pmonth,int pyear)
	{
		this.day = pday;
		this.month = pmonth;
		this.year = pyear;
	}
	
	public int getDay()
	{
		return day;
	}
	
	public void setDay(int pday)
	{
		this.day = pday;
	}
	
	public int getMonth()
	{
		return month;
	}
	
	public void setMonth(int pmonth)
	{
		this.month=pmonth;
	}
	
	public int getYear()
	{
		return this.year;
	}
	
	public void setYear(int pyear)
	{
		this.year = pyear;
	}
	
	public boolean isValid()
	{
		boolean isCheck;
		if(this.month==2)
		{
			if(this.day < 0 || this.day > 28)
			{
				isCheck = false;
			}
			else
			{
				isCheck = true;
			}
		}
		else 
		{
			if(this.month == 4 || this.month == 6 || this.month == 9 || this.month == 11) 
			{
				if(this.day < 0 || this.day > 30)
				{
					isCheck = false;
				}
				else
				{
					isCheck = true;
				}
			}
			else 
			{	
				if(this.day < 0 || this.day > 31)
				{
					isCheck = false;
				}
				else
				{
					isCheck = true;
				}
			}
			
		}
		System.out.println(isCheck ? "유효한 날짜입니다." : "유효하지 않은 날짜입니다.");
		return isCheck;
	}
}
