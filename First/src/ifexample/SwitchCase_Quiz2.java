package ifexample;

public class SwitchCase_Quiz2 {

	public static void main(String[] args) {
		
		int number = 3;
		String str = "";
		switch(number)
		{
		case 1:
			str = "약국";
			break;
		case 2:
			str = "정형외과";
			break;
		case 3:
			str = "피부과";
			break;
		case 4:
			str = "치과";
			break;
		case 5:
			str ="헬스 클럽";
			break;
		}
		
		System.out.println(number+"층"+str+"입니다.");
	}

}
