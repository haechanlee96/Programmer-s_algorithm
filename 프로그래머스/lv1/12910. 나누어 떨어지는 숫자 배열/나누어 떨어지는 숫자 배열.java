import java.util.*;

class Solution {
    public int[] solution(int[] arr, int divisor) {
        
        int count = 0;
        List<Integer> arrList = new ArrayList<>();
        
        
        for(int i = 0; i<arr.length; i++){
            if(arr[i]%divisor == 0){
                arrList.add(arr[i]);
                count ++;
            } 
        }
        
        int[] answer = new int[arrList.size()];
        
        Collections.sort(arrList);
        for(int i = 0; i<arrList.size(); i++){
            answer[i]=arrList.get(i);
        }
        
        
        if(count == 0){
            answer = new int[]{-1};

        }
        
        return answer;
    }
}