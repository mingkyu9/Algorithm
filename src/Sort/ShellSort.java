package Sort;

import java.util.Arrays;

public class ShellSort {
	public void sort(int[]arr) {
		int length=arr.length;
		
		System.out.println(String.format("�ʱ�迭:%s \n", Arrays.toString(arr)));
		System.out.println("---");
		for(int gap=length/2;gap>0;gap/=2) {
			System.out.println(String.format("���� %s(��)�� �迭�� �����ϴ�",gap));
		for(int startIndex=0;startIndex<gap;startIndex++) {
			this.insertSortByHap(arr,gap,startIndex);
		}
		}
		System.out.println("---");
	}
	private void insertSortByHap(int[]arr,int gap,int startIndex) {
		for(int i=startIndex+gap;o<arr.length;i+=gap) {
			int j;
			int temp=arr[j];
			
			for(j=i-gap;j>=0&&arr[j]>temp;j-=gap) {
				arr[j+gap]=arr[j];
			}
			arr[j+gap]=temp;
		}
		System.out.println(String.format("���� ���� �� �迭: %s \n", Arrays.toString(arr)));
	}
}
