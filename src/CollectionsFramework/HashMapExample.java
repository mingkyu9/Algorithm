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
			put("apple","사과");
			put("car","자동차");
			put("book","책");
		}};
		System.out.println("[HashMap에서 자주 사용되는 메서드를 사용해 봅시다.]\n");
		Map<String,String>dictionary=new HashMap<>();
		dictionary.put("student", "학생");
		dictionary.put("school", "학교");
		dictionary.put("book", "책");
		dictionary.put("pencil", "연필");
		dictionary.put("blackboard", "칠판");
		dictionary.put("education", "공부");
		
		System.out.println("[사전 데이터 삽입 후 출력 결과]");
		print(dictionary);
		
		System.out.println("[잘못 된 education 값을 변경]");
		dictionary.replace("education", "교육");
		System.out.println(String.format("변경된 education 값:%s\n", dictionary.get("education")));
		
		System.out.println("pencil 확인");
		if(dictionary.containsKey("pencil")) {
			System.out.println("존재");
		}
		else {
			System.out.println("없음");
		}
		System.out.println(String.format("현재 데이터 크기:%s", dictionary.size()));
		dictionary.clear();
	}
	public static void print(Map<String,String> map) {
		map.forEach((key,value)->System.out.println(String.format(" %s=%s", key,value)));
		System.out.println("");
	}

}
