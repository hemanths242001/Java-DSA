package javaStrings;

public class ValidAnagrams {

	public static void main(String[] args) {
		String s = "anagram";
		String t = "nagaram";
		System.out.println(isAnagram(s, t));
	}
	
    public static boolean isAnagram(String s, String t) {
	        int count[] = new int[26];
	        
	        for(char c: s.toCharArray()) {
	        	count[c - 'a']++;
	        }
	        
	        for(char c : t.toCharArray()) {
	        	count[c - 'a']--;
	        }
	        
	        for(int i = 0; i<26; i++) {
	        	if(count[i] != 0) {
	        		return false;
	        	}
	        }
	        
	        return true;
    }


}
