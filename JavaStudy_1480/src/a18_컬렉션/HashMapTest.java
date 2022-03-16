package a18_컬렉션;

import java.util.HashMap;

public class HashMapTest {
	
	public static void main(String[] args) {
		HashMap<String, String> hashMap = new HashMap<String, String>();
		hashMap.put("가", "김선협");
		hashMap.put("나", "황선협");
		hashMap.put("다", "조선협");
		hashMap.put("라", "박선협");
		hashMap.put("마", "진선협");
		
		System.out.println(hashMap);
		System.out.println();
		System.out.println(hashMap.get("다"));
		System.out.println(hashMap.containsValue("박선협"));
		System.out.println(hashMap.remove("라"));
		System.out.println(hashMap);
		System.out.println(hashMap.replace("마", "이선협"));
		System.out.println(hashMap);
		
	}

	

}
