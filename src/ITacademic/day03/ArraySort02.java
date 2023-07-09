package ITacademic.day03;

import java.util.Arrays;

public class ArraySort02 {

	public static void main(String[] args) {
		int[] arr=new int[10];
		
		for(int i=0;i<arr.length;i++) {
			arr[i]=(int)(Math.random()*20)+1;
		}
		System.out.println("정렬 전: "+Arrays.toString(arr));
		
		Arrays.sort(arr);
		
		System.out.println("정렬 후: "+Arrays.toString(arr));
	}
}
		