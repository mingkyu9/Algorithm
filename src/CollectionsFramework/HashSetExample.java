package CollectionsFramework;

import java.util.HashSet;
import java.util.Set;


	

public class HashSetExample {

	public static void main(String[] args) {
		Set set1= new HashSet();
		Set<Integer> set2=new HashSet<Integer>();
		Set<Integer> set3=new HashSet<>();
		Set<String> set4=new HashSet<>(5);
		Set<String> set5=new HashSet<String>(){{
			add("computer");
			add("mouse");
			add("KeyBorad");
		}};
		Set<Integer> hashSet=new HashSet<>();
		int[] datas= {10,20,40,50,30,60,90,80,70,100};
		for(int data:datas) {
			hashSet.add(data);
		}
		System.out.println("데이터 삽입 후 결과");
		System.out.println("HashSet 결과: "+hashSet);
		System.out.println("");
		
		System.out.println("데이터 50 여부");
		if(hashSet.contains(50)) {
			System.out.println("있음");
		}
		else {
			System.out.println("없음");
		}
		System.out.println("데이터 삭제 전 hashSet 크기: "+hashSet.size());
		
		hashSet.remove(10);
		hashSet.remove(20);
		hashSet.remove(40);
		
		System.out.println("삭제 후 크기"+hashSet.size());
		System.out.println("");
	
		hashSet.clear();
		System.out.println(" clear 후 크기: "+hashSet.size());
		System.out.println("");
		
		if(hashSet.isEmpty()) {
			System.out.println("존재 하지 않음");
		}
		else {
			System.out.println("존재 함");
		}
	}

}
