class Solution {
    public boolean solution(int x) {
        boolean answer = false;
        
        String[] arr = String.valueOf(x).split("");
        
        int sum = 0;
        
        for(String str : arr){
            sum += Integer.parseInt(str);
        }
        
        answer = (x % sum ==0)? true : false;
        
        return answer;
    }
}