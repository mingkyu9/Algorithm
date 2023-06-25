package BackJun;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class P1707_�̺б׷����Ǻ��ϱ� {
static ArrayList<Integer>[] A;
static int[] check;
static boolean[] visited;
static boolean IsEven;
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br
			=new BufferedReader(new InputStreamReader(System.in));
		int testcase=Integer.parseInt(br.readLine());
		for(int t=0;t<testcase; t++){ //�ֿ��� �׽�Ʈ ���̽� ��ŭ ������
			String[] s=br.readLine().split(" ");
			int V=Integer.parseInt(s[0]);
			int E=Integer.parseInt(s[1]);
			A=new ArrayList[V+1];
			visited=new boolean[V+1];
			check=new int[V+1];
			IsEven=true;
			for(int i=1; i<=V; i++) {
				A[i]=new ArrayList<Integer>();
			}
			//���� ������ �����ϱ�
			for(int i=0;i<E;i++) {
				s=br.readLine().split(" ");
				int start=Integer.parseInt(s[0]);
				int end=Integer.parseInt(s[1]);
				A[start].add(end);
				A[end].add(start);
			}
			// ��� ��忡�� DFS ���� �ؾ���
			for(int i=1; i<=V; i++) {
				if(IsEven) {
					DFS(1);
				}else {
					break;
				}
			}
		}
		if(IsEven) System.out.println("Yes");
		else System.out.println("No");
		
	}
	private static void DFS(int start) {
		visited[start]=true;
		for(int i:A[start]) { //��������Ʈ�� �޾Ƽ� start���� ����� ��� ��带 Ž��
			if(!visited[i]) {
				//�ٷ� ������ �ִ� ���� �ٸ� �������� �з��� ���ִ� ��
				check[i]=(check[start]+1)%2;
				DFS(i);
			}
			else {
				if(check[start]==check[i]) {
					IsEven=false;
				}
			}
		}
	}

}
