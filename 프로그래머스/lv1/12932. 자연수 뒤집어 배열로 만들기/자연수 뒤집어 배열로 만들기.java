class Solution {
    public int[] solution(long n) {
        
       String str = Long.toString(n);
       String[] arr = str.split("");
       int[] answer = new int[arr.length]; 
    
       for(int i = 0; i<arr.length; i++){
           answer[i] = Integer.parseInt(arr[arr.length-1-i]);
       }     
        
        return answer;
    }
}