package BackJun;

import java.util.Scanner;

public class P_11050���װ�����ϱ� {
	static int N,K;
	static int D[][];
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		N=sc.nextInt();
		K=sc.nextInt();
		D=new int[N+1][N+1];
		//�ʱ�ȭ
		for(int i=0;i<=N;i++) {
			D[i][i]=1;
			D[i][0]=1;
			D[i][i]=1;
		}
		//��ȭ������ �迭 �ϼ��ϱ�
		for(int i=2;i<=N;i++) {
			for(int j=1;j<=i;j++) {
				D[i][j]=D[i-1][j]+D[i-1][j-1];
				}
		}
		System.out.println(D[N][K]);
	}

}
