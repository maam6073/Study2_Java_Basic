package step3;

public class BeginnerLevel extends PlayerLevel
{

	@Override
	public void run() {
		System.out.println("열심히 뛰는 중");
	}

	@Override
	public void jump() {
		System.out.println("조빱이라 못함");
	}

	@Override
	public void turn() {
		System.out.println("조빱이라 못함");
	}

	@Override
	public void showLevel() {
		System.out.println("**** 나는 초보자 ****");
	}

}
