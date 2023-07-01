import java.util.*;
class Solution {
    public String solution(String s) {
        String answer = "";
        
        
        String [] arr = s.split("");
        
        Arrays.sort(arr,Collections.reverseOrder());
        String s1 = String.join("",arr);
        
        answer = s1;
        return answer;
    }
}