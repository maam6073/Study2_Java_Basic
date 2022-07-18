package step3;

public class SuperLevel extends PlayerLevel
{

	@Override
	public void run() {
		System.out.println("존내게 잘 뛰댕김");
	}

	@Override
	public void jump() {
		System.out.println("존내게 높게 점프");
	}

	@Override
	public void turn() {
		System.out.println("존내게 빙글빙글");
	}

	@Override
	public void showLevel() {
		System.out.println("****** 나는 쌉고수 ******");
	}
}
