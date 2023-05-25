package Hum;

import java.util.HashMap;
import java.util.Scanner;

public class Hum {
	static HashMap<String,String> hm=new HashMap<String,String>();
	static Scanner sc=new Scanner(System.in);
	public static void main(String[] args) {
	public static void insert() {
		String name,phone;
		System.out.print("저장할 고객의 이름");
		name=sc.next();
		if(hm.containsKey(name)) {
			System.out.println("이미 존재 이름");
			return;
		}
		else {
			System.out.println("저장할 고객의 번호");
			phone=sc.next();
			hm.put(name, phone);
			System.out.println("저장완료");
		}
	}
	
	public static void search() {
		String searchName;
		System.out.println("검색할 이름");
		searchName=sc.next();
		if(hm.containsKey(searchName)) {
			System.out.println("검색완료");
			System.out.println("검색된 번호"+hm.get(searchName));
		}
		else {
			System.out.println("검색된 이름 X");
		}
	}
	public static void show() {}
		int choice;
		while(true) {
			System.out.println("------전화번호부-------");
			System.out.println("1. 고객 정보 저장");
			System.out.println("2. 고객 정보 검색");
			System.out.println("3. 고객 정보 출력");
			System.out.print("번호 입력");
			choice=sc.nextInt();
			if(choice==1) {
				System.out.println("고객정보 저장");
				insert();
			}
			else if(choice==2) {
				System.out.println("고객정보 검색");
				search()
			}
			else if(choice==3) {
				System.out.println("고객 정보 출력");
				show()
			}
			else if(choice==4) {
				System.out.println("프로그램 종료");
				break;
			}
			else {
				System.out.println("잘못입력");
			}
			}
	
		

	}

}
