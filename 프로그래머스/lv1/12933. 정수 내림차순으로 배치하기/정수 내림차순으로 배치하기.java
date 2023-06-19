import java.util.*;

class Solution {
    public long solution(long n) {
        long answer = 0;
        
        String s = String.valueOf(n);
        String[] arr = s.split("");
        
        Arrays.sort(arr, Collections.reverseOrder());
        String s1 = String.join("", arr);
        
        // Arrays.sort(arr, Collections.reverseOrder());
        // String s1 = "";
        // for(int i=0; i<arr.length; i++){
        //     s1 += arr[i];
        // }
        
        answer = Long.parseLong(s1);
        
        return answer;
    }
}