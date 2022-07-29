package collection.hashset;

import java.util.HashSet;

import collection.Member;

public class HashSetTest {

	public static void main(String[] args) {
		HashSet<Member> hashSet = new HashSet<Member>();
		hashSet.add(new Member(1,"임정순"));
		hashSet.add(new Member(2,"박현정"));
		hashSet.add(new Member(3,"홍연의"));
		hashSet.add(new Member(4,"강감찬"));
		hashSet.add(new Member(5,"강감찬"));
		
		System.out.println(hashSet);
	}

}
