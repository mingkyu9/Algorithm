package BackJun;

import java.util.Scanner;

public class P1717_����ǥ���ϱ� {
	static int parent[];
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int N=sc.nextInt();
		int M=sc.nextInt();
		parent=new int[N+1];
		for(int i=0;i<N+1;i++) { //��ǥ ��� �ʱ�ȭ
			parent[i]=i;
		}
		for(int i=0;i<M;i++) { //���� ����ϴ� �κ�
			int question=sc.nextInt();
			int a=sc.nextInt();
			int b=sc.nextInt();
			if(question==0) { //Union
				union(a,b);
			}else { //�� ���� ������ ����
				boolean result=checkSame(a, b);
				if(result){
					System.out.println("Yes");
				}
				else {
					System.out.println("No");
				}
			}
			
		}
	}

	private static void union(int a, int b) {
		//��ǥ��带 ã�Ƽ� ����
		a=find(a);
		b=find(b);
		if(a!=b) {
			parent[b]=a;  //�ΰ� ����
		}
	}

	private static int find(int a) {
		if(a==parent[a]) return a;
		else {
			return parent[a]=find(parent[a]); 
		}
	}
	private static boolean checkSame(int a,int b) {
		a=find(a);
		b=find(b);
		if(a==b) return true;
		return false;
	}

}
