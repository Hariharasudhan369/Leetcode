class Solution {
    public int myAtoi(String s) {
        
        long a = 0L;
        s = s.stripLeading();
        boolean minus = false;

        if(s.equals("")) return 0;
        
        if(s.charAt(0) == '-'){
            s = s.substring(1);
            minus = true;
        } else if(s.charAt(0) == '+'){
            s = s.substring(1);
        }
        
        for(int i=1; i<=s.length(); i++){
            try{
                a = Long.valueOf(s.substring(0,i));
                if(a>2147483647){
                    if(minus) return -2147483648;
                    else return 2147483647;
                }
            } catch(Exception e){
                if(minus) return (int) (a-2*a);
                else return (int) a;
            }
            
        }
        if(minus) return (int) (a-2*a);
        else return (int) a;
    }
}