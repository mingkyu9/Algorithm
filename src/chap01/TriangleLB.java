package chap01;

import java.util.Scanner;

public class TriangleLB {

	public static void main(String[] args) {
		Scanner stdIn=new Scanner(System.in);
		int n;
		System.out.println("���� �̵ �ﰢ�� ���");
		
		do {
			System.out.println("�� �� �ﰢ���Դϱ�?");
			n=stdIn.nextInt();
			for(int i=1;i<=n;i++) {
				for(int j=1;j<=i;j++) {
					System.out.print("*");
				}
				System.out.println();
			}
			
		}while(n<=0);
	}

}
