class Solution {
    public String convert(String s, int numRows) {
        
        List<List<Character>> list = new ArrayList<>();
        for (int i = 0; i < numRows; i++) {
            List<Character> temp = new ArrayList<>();
            list.add(temp);
        }
		
        int index = 0;
        while (index < s.length()) {
            
            for (int i = 0; i < numRows; i++) {
                if (index >= s.length()) break;;
                list.get(i).add(s.charAt(index++));
            }
            
            for (int i = numRows - 2; i > 0 ; i--) {
                if (index >= s.length()) break;;
                list.get(i).add(s.charAt(index++));
            }
        }
		
        String str = "";
        for (int i = 0; i < list.size(); i++) {
            for (int j = 0; j < list.get(i).size(); j++) {
                str = str + list.get(i).get(j);
            }
        }
        return str;
    }
}