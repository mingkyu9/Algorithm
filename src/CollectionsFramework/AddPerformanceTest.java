package CollectionsFramework;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.*;


public class AddPerformanceTest {

	public static void main(String[] args) {
		List<Integer> arrayList=new ArrayList<>(10);
		List<Integer> LinkedList=new LinkedList<>();
		int range=100000;
		
		long startTime=System.nanoTime();
		
		for(int i=0;i<range;i++) {
			arrayList.add(i);
		}
		long endTime=System.nanoTime();
		long duration=endTime-startTime;
		System.out.println("ArrayList add: "+duration);
		
		startTime=System.nanoTime();
		
		for(int i=0;i<range;i++) {
			LinkedList.add(i);
		}
		endTime=System.nanoTime();
		duration=endTime-startTime;
		System.out.println("LinkedList add: "+duration);
	}

}
