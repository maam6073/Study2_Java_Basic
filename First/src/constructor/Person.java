package constructor;

public class Person 
{
	String name;
	float height;
	float weight;
	
	public Person() {}
	
	public Person(String pname)
	{
		this.name = pname;
	}
	
	public Person(String pname,float pheight, float pweight)
	{
		this.name = pname;
		this.height = pheight;
		this.weight = pweight;
	}
}
