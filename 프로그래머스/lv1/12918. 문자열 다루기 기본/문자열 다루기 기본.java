import java.util.*;

class Solution {
    public boolean solution(String s) {
        boolean answer = true;
        
        if(s.length() != 4 && s.length() != 6){
            return false;
        }
        
        
        try{
            int i = Integer.parseInt(s);
        } catch (NumberFormatException e){
            return false;
        }
        
        return answer;
    }
}