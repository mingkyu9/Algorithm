package BackJun;

import java.util.Scanner;

public class P11047_�����������ּڰ����ϱ� {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int N=sc.nextInt();
		int K=sc.nextInt();
		int A[]=new int[N];
		for(int i=0;i<N;i++) {
			A[i]=sc.nextInt();
		}
		//�׸��� �˰��� -> �ִ��� ū ���� ���� ���
		int count=0;
		for(int i=N-1;i>=0;i--) {
			if(A[i]<=K) {
				count+=(K/A[i]);
				K=K%A[i];
			}
		}
		System.out.println(count);
	}

}
