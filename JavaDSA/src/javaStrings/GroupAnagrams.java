package javaStrings;

import java.util.List;
import java.util.Map;
import java.util.HashMap;
import java.util.ArrayList;
import java.util.Arrays;

public class GroupAnagrams {

	public static void main(String[] args) {
		String strs[] = {"eat","tea","tan","ate","nat","bat"};
		 List<List<String>> result = groupAnagrams(strs);
	     System.out.println(result);
	}
	public static List<List<String>> groupAnagrams(String strs[]){
		HashMap<String, List<String>> m = new HashMap<>();
		
		for(String s : strs) {
			char[] ch = s.toCharArray();
			Arrays.sort(ch);
			String s1 = String.valueOf(ch);
			
			if(!m.containsKey(s1)) {
				m.put(s1, new ArrayList<>());
			}
			m.get(s1).add(s);
		}
		return new ArrayList(m.values());
	}

}
