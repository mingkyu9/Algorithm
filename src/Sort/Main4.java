package Sort;

import java.util.Arrays;

import chap06.QuickSort;

public class Main4 {

	public static void main(String[] args) {
		QuickSort quickSort=new QuickSort();
		int[]arr=new int[] {26,10,35,19,7,3,12};
		System.out.println(String.format("�ʱ� �迭: %s",Arrays.toString(arr)));
		quickSort.quick(arr,0,arr.length-1);
		System.out.println("�� ���� �Ϸ� ��: "+Arrays.toString(arr));
	}

}
