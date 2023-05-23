package ���;

import java.util.Scanner;

public class Hanoi {

	public static void main(String[] args) {
		System.out.println("���� ���� �Է����ּ���");
		Scanner scanner =new Scanner(System.in);
		
		int disks=scanner.nextInt();
		System.out.println("[���]");
		topOfHanoi(disks,"A","B","C");
		}
	public static void topOfHanoi(int disks,String begin,String middle,String end) {
		if(disks==1) {
			System.out.println(String.format("1�� ������ %s ������� �ű�",end));
			return;
		}
		topOfHanoi(disks-1,begin,end,middle);
		System.out.println(String.format("%s�� ������ %s ������� �ű�",disks,end));
		topOfHanoi(disks-1,middle,begin,end);
	}
}
