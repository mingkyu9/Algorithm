package Hum;

import java.util.HashMap;
import java.util.Scanner;

public class Hum {
	static HashMap<String,String> hm=new HashMap<String,String>();
	static Scanner sc=new Scanner(System.in);
	public static void main(String[] args) {
	public static void insert() {
		String name,phone;
		System.out.print("������ ���� �̸�");
		name=sc.next();
		if(hm.containsKey(name)) {
			System.out.println("�̹� ���� �̸�");
			return;
		}
		else {
			System.out.println("������ ���� ��ȣ");
			phone=sc.next();
			hm.put(name, phone);
			System.out.println("����Ϸ�");
		}
	}
	
	public static void search() {
		String searchName;
		System.out.println("�˻��� �̸�");
		searchName=sc.next();
		if(hm.containsKey(searchName)) {
			System.out.println("�˻��Ϸ�");
			System.out.println("�˻��� ��ȣ"+hm.get(searchName));
		}
		else {
			System.out.println("�˻��� �̸� X");
		}
	}
	public static void show() {}
		int choice;
		while(true) {
			System.out.println("------��ȭ��ȣ��-------");
			System.out.println("1. �� ���� ����");
			System.out.println("2. �� ���� �˻�");
			System.out.println("3. �� ���� ���");
			System.out.print("��ȣ �Է�");
			choice=sc.nextInt();
			if(choice==1) {
				System.out.println("������ ����");
				insert();
			}
			else if(choice==2) {
				System.out.println("������ �˻�");
				search()
			}
			else if(choice==3) {
				System.out.println("�� ���� ���");
				show()
			}
			else if(choice==4) {
				System.out.println("���α׷� ����");
				break;
			}
			else {
				System.out.println("�߸��Է�");
			}
			}
	
		

	}

}
