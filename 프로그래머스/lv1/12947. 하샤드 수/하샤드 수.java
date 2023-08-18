class Solution {
    public boolean solution(int x) {
        boolean answer = false;
        
        String str = Integer.toString(x);
        String[] arr = str.split(""); 
        
        int sum = 0;
        
        for(int i = 0; i<arr.length; i++){
            sum += Integer.parseInt(arr[i]);
        }
        
        answer = (x % sum ==0)? true : false;
        
        return answer;
    }
}