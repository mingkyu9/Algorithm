package Sort;

import java.util.Arrays;

public class Main3 {

	public static void main(String[] args) {
		ShellSort shellSort=new ShellSort();
		int[]arr=new int[] {32,29,15,29,41,19,39,22,1};
		
		shellSort.sort(arr);
		System.out.println("셸 정렬 완료후 "+Arrays.toString(arr));
	}

}
