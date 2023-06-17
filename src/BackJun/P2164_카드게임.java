package BackJun;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class P2164_카드게임 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		Queue<Integer> myQueue=new LinkedList<>();
		int N=sc.nextInt();
		for(int i=1;i<N;i++) {
			myQueue.add(i);
		}
		while(myQueue.size()>1) {
			myQueue.poll();//맨 위에 카드 버림
			int temp=myQueue.poll();
			myQueue.add(temp);
		}
		System.out.println(myQueue.poll());
	}

}
