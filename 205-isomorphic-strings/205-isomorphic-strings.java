class Solution {
    public boolean isIsomorphic(String str1, String str2) {
        
        if(str1.length() != str2.length()) {
			return false;
		}
		HashMap<Character, Character> characterMap = new HashMap<Character, Character>();
		for(int i = 0; i < str1.length(); i++) {
			if((characterMap.containsKey(str1.charAt(i)) && characterMap.get(str1.charAt(i)) != str2.charAt(i)) || (characterMap.containsValue(str2.charAt(i)) && !characterMap.containsKey(str1.charAt(i)))){
				return false;
			}
			characterMap.put(str1.charAt(i), str2.charAt(i));
		}
		return true;
        
    }
}