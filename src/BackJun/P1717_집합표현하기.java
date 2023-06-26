package BackJun;

import java.util.Scanner;

public class P1717_집합표현하기 {
	static int parent[];
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int N=sc.nextInt();
		int M=sc.nextInt();
		parent=new int[N+1];
		for(int i=0;i<N+1;i++) { //대표 노드 초기화
			parent[i]=i;
		}
		for(int i=0;i<M;i++) { //질의 계싼하는 부분
			int question=sc.nextInt();
			int a=sc.nextInt();
			int b=sc.nextInt();
			if(question==0) { //Union
				union(a,b);
			}else { //두 원소 같은지 보기
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
		//대표노드를 찾아서 연결
		a=find(a);
		b=find(b);
		if(a!=b) {
			parent[b]=a;  //두개 연결
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
