package collection.hashset;

import collection.Member;

public class MemberHashSetTest {

	public static void main(String[] args) 
	{
		MemberHashSet memberhashset = new MemberHashSet();
		Member memberLee = new Member(1001,"������");
		Member memberSon = new Member(1002,"�չα�");
		Member memberPark = new Member(1003,"�ڼ���");
		
		memberhashset.addMember(memberLee);
		memberhashset.addMember(memberSon);
		memberhashset.addMember(memberPark);
		memberhashset.showAllMember();
		
		Member memberHong = new Member(1003, "ȫ�浿"); //���̵� �ߺ�ȸ�� �߰�
		memberhashset.addMember(memberHong);
		memberhashset.showAllMember();
	}
}
