import java.util.*;

class Solution {
    public int solution(int n) {
        int answer = 0;
        int count = 0;
        
        List<Integer> arr = new ArrayList<>();
        
        
        while(n != 0){
            arr.add(n%3);
            n = n/3;
            count++;
        }
        
        Collections.reverse(arr);
        
        for(int i=0; i<arr.size(); i++){
            answer += Math.pow(3, i) * arr.get(i);
        }
        
        return answer;
    }
}