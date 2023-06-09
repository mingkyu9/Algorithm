package chap06;

import java.util.Scanner;

public class BubbleSort {
	static void swap(int[] a,int idx1,int idx2) {
		int t=a[idx1];
		a[idx1]=a[idx2];
		a[idx2]=t;
	}
	static void bubbleSort(int[] a,int n) {
		for(int i=0;i<n-1;i++) {
			for(int j=n-1;j>i;j--) {
				if(a[j-1]>a[j])
					swap(a,j-1,j);
			}
		}
	}
	public static void main(String[] args) {
		Scanner stdIn=new Scanner(System.in);
		System.out.print("길이");
		int nx=stdIn.nextInt();
		int[]x=new int[nx];
		
		for(int i=0;i<nx;i++) {
			System.out.println("x["+i+"]:");
			x[i]=stdIn.nextInt();
		}
		bubbleSort(x,nx);
		System.out.println("오름차순으로 정렬");
		for(int i=0;i<nx;i++) {
			System.out.println("x["+i+"]="+x[i]);
		}
	}

}
/*
버블 정렬 버전 3
static void bubblesort(int[]a,int n) {
	int k=0; //a[k] 보다 앞쪽은 정렬을 마침
	while(k<n-1) {
		int last=n-1;
		for(int j=n-1;j>k;j--)
			if(a[j-1]>a[j]) {
				swap(a,j-1,j);
				last=j;
			}
		k=last;
	}
}
*/