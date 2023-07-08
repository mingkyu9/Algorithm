package ITacademic;

import java.util.Arrays;

public class ArraySort01 {

	public static void main(String[] args) {
		int[] arr=new int[10];
		
		for(int i=0;i<arr.length;i++) {
			arr[i]=(int)(Math.random()*20)+1;
		}
		System.out.println("정렬 전: "+Arrays.toString(arr));
		
		int temp=0;
		for(int i=(arr.length);i>0;i--) {
			for(int j=0;j<(i-1);j++) {
				
				if(arr[j]>arr[j+1]) {
					temp=arr[j+1];
					arr[j+1]=arr[j];
					arr[j]=temp;
				}
			}
		}
		System.out.println("정렬 후: "+Arrays.toString(arr));
	}

}
