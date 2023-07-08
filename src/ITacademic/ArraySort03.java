package ITacademic;

import java.util.Arrays;
import java.util.Comparator;

public class ArraySort03 {

	public static void main(String[] args) {
		Integer[] arr=new Integer[10];
		
		for(int i=0;i<arr.length;i++) {
			arr[i]=(int)(Math.random()*20)+1;
		}
		System.out.println("정렬 전: "+Arrays.toString(arr));
		
		Arrays.sort(arr,Comparator.reverseOrder());
		
		System.out.println("정렬 후: "+Arrays.toString(arr));
	}
}
		