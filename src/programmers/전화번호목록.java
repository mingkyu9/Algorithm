package programmers;

import java.util.HashMap;
import java.util.Map;

public class ��ȭ��ȣ��� {
	public boolean solution(String[] phone_book) {
		HashMap<String, Integer> map=new HashMap<>();
		for(int i=0;i<phone_book.length;i++) 
			map.put(phone_book[i],1);
		for(int i=0;i<phone_book.length;i++)
			for(int j=1;j<phone_book[i].length();j++)
				if(map.containsKey(phone_book[i].substring(0,j)))
					return false;
		return true;
			
	}
	
	public static void main(String[] args) {
        String[] phone_book = {"119", "97674223", "1195524421"};
        ��ȭ��ȣ��� sol = new ��ȭ��ȣ���();
        System.out.println(sol.solution(phone_book));
    }
}