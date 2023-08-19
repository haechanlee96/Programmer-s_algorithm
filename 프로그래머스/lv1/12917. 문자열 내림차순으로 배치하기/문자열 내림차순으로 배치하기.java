import java.util.*;

class Solution {
    public String solution(String s) {
        String answer = "";
        
        String[] arr = s.split("");
        Arrays.sort(arr, Comparator.reverseOrder());
        answer = String.join("", arr);
        
        
        return answer;
    }
}