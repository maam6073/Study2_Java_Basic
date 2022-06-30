package loopexample;

public class NestedLoop {

	public static void main(String[] args) 
	{
		for(int times = 1; times <= 9; times++)
		{
			for(int dan =3; dan <= 7; dan++)
			{
				System.out.print(dan + "X"+ times + "=" +dan * times +"  ");
			}
			System.out.println();
		}
	}
}
