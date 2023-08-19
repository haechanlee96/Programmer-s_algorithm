class Solution {
    public String solution(int n) {
        String answer = "";
        
        String h = "수";
        String j = "박";
        
        for(int i=1; i<n+1; i++){
            if(i%2 == 0) {
                answer += j;
            } else {
                answer += h;
            }
        }
        
        return answer;
    }
}