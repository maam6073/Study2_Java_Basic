package step3;

public class AdvancedLevel extends PlayerLevel
{

	@Override
	public void run() {
		System.out.println("빨리 달리는중");
	}

	@Override
	public void jump() {
		
		System.out.println("짬프 뛰는중");
	}

	@Override
	public void turn() {
		System.out.println("조빱이라 안됌");
	}

	@Override
	public void showLevel() {
			System.out.println("***** 내 레벨은 중급자 *****");
	}

}
