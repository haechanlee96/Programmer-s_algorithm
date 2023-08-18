import java.util.*;

class Solution {
    public long solution(long n) {
        long answer = 0;
        
        String str = Long.toString(n);
        String[] arr = str.split("");
        
        Arrays.sort(arr,Collections.reverseOrder());
        String str1 = String.join("",arr);
        
        answer = Long.parseLong(str1);
        return answer;
    }
}