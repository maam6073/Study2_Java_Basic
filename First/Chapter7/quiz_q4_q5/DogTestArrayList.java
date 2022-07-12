package quiz_q4_q5;
import java.util.ArrayList;


public class DogTestArrayList 
{
	public static ArrayList<Dog> dogarr = new ArrayList<Dog>();
	
//	public static void showInfo()
//	{
//		for(Dog i : dogarr)
//		{
//			i.showDogInfo();
//		}
//	}
	
	public static void main(String[] args)
	{
		Dog dog1 = new Dog();
		dog1.setName("바위1");
		dog1.setType("시바견1");
		Dog dog2 = new Dog();
		dog2.setName("바위2");
		dog2.setType("시바견2");
		Dog dog3 = new Dog();
		dog3.setName("바위3");
		dog3.setType("시바견3");
		Dog dog4 = new Dog();
		dog4.setName("바위4");
		dog4.setType("시바견4");
		Dog dog5 = new Dog();
		dog5.setName("바위5");
		dog5.setType("시바견5");
		
		dogarr.add(dog1);
		dogarr.add(dog2);
		dogarr.add(dog3);
		dogarr.add(dog4);
		dogarr.add(dog5);
		
		
		for(Dog i : dogarr)
		{
			i.showDogInfo();
		}
	}
}
