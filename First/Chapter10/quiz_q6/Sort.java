package quiz_q6;

public interface Sort
{
	void ascending(int[] arr);
	void descending(int[] arr);
	public void description();
	default void description_()
	{
		System.out.println("숫자를 정렬하는 알고리즘입니다.");
	}
}
