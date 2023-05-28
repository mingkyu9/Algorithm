package CollectionsFramework;

import java.util.HashMap;
import java.util.Map;

public class HashMapExample {

	public static void main(String[] args) {
		Map objectMap=new HashMap();
		Map<String,String> map1=new HashMap<String,String>();
		Map<String,String> map2=new HashMap<>();
		Map map3=new HashMap<String,String>();
		Map map4=new HashMap<String,String>(){{
			put("apple","���");
			put("car","�ڵ���");
			put("book","å");
		}};
		System.out.println("[HashMap���� ���� ���Ǵ� �޼��带 ����� ���ô�.]\n");
		Map<String,String>dictionary=new HashMap<>();
		dictionary.put("student", "�л�");
		dictionary.put("school", "�б�");
		dictionary.put("book", "å");
		dictionary.put("pencil", "����");
		dictionary.put("blackboard", "ĥ��");
		dictionary.put("education", "����");
		
		System.out.println("[���� ������ ���� �� ��� ���]");
		print(dictionary);
		
		System.out.println("[�߸� �� education ���� ����]");
		dictionary.replace("education", "����");
		System.out.println(String.format("����� education ��:%s\n", dictionary.get("education")));
		
		System.out.println("pencil Ȯ��");
		if(dictionary.containsKey("pencil")) {
			System.out.println("����");
		}
		else {
			System.out.println("����");
		}
		System.out.println(String.format("���� ������ ũ��:%s", dictionary.size()));
		dictionary.clear();
	}
	public static void print(Map<String,String> map) {
		map.forEach((key,value)->System.out.println(String.format(" %s=%s", key,value)));
		System.out.println("");
	}

}
