package Sort;

public class QuickSort {
	public void quick(int[]arr,int left,int right) {
		if(left>=right) {
			return;
		}
		int l=left;
		int r=right;
		
		int pivot=arr[(left+right)/2];
		System.out.println(String.format("pivotÀÇ °ª: %s",pivot));
		while(i<j) {
			while(arr[i]<pivot) {
				i++;
			}
			while(arr[j]>pivot) {
				j--;
			}
			if(i>=j) {
				break;
			}
			if(arr[i]==pivot&&arr[j]==pivot) {
				i++;
				continue;
			}
			int temp=arr[i];
			int arr[i]=arr[j];
			int arr[j]=temp;
		}
		quick(arr,left,i-1);
		quick(arr,i+1,right);
	}
}
