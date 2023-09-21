import java.util.*;

class Solution {
    public int solution(int k, int m, int[] score) {
        int answer = 0;
        int index = 0;
        
        List<Integer> arr = new ArrayList<>();
        for (int a : score){
            arr.add(a);
        }
        
        Collections.sort(arr, Collections.reverseOrder());
        
        index = score.length / m ;
        
        for (int i=1; i<=index; i++){
            int temp = arr.get((i*m)-1);
            answer += temp * m;
        }

        
        return answer;
    }
}