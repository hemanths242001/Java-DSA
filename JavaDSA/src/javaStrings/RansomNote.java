package javaStrings;

public class RansomNote {

	public static void main(String[] args) {
		String magazine = "aab";
		String ransomNote = "abc";
		System.out.println(canConstruct(ransomNote, magazine));
		
	}
	public static boolean canConstruct(String ransomNote, String magazine) {
        int freq[] = new int[26];
        for(char c : magazine.toCharArray()) {
        	freq[c - 'a']++;
        }
        for(char c : ransomNote.toCharArray()) {
        	if(freq[c - 'a'] == 0) {
        		return false;
        	}
        	freq[c - 'a']--;
        }
        return true;
    }
}
