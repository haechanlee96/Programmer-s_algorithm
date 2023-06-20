class Solution {
    public boolean solution(int x) {
        boolean answer = false;
        
        String s = Integer.toString(x);
        String[] arr = s.split("");
        
       // arr의 배열수를 각 더한 값이 a > (s%a == 0)? true : flase 
        int total = 0;
        
        for (int i=0; i<arr.length; i++){
            total += Integer.parseInt(arr[i]);
        }
        
        answer = (x%total == 0)? true : false;
        
        
        
        return answer;
    }
}