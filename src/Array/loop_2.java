package Array;

import java.util.Arrays;

public class loop_2 {

	public static void main(String[] args) {
		int[]students= {1,2,3,4,5,6,7,8,9,10};
		System.out.println("���� ��: "+Arrays.toString(students));
		
		int[]students2=new int[students.length];
		for(int i=0;i<students.length;i++) {
			students2[(students.length-1)-i]=students[i];
		}
		System.out.println("���� ��: "+Arrays.toString(students2));
	}

}
