class Solution {
    public int[] solution(long n) {
        
        String s = String.valueOf(n);
        int[] answer = new int[s.length()];
        
        String[] arr = s.split("");
        
        for(int i=arr.length-1; i>=0; i--){
            answer[arr.length-1-i] = Integer.parseInt(arr[i]);
        }
        
        return answer;
    }
}