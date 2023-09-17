import java.util.Date;

class Solution {
    public String solution(int a, int b) {
        
        
        Date date = new Date(2016,a-1,b-1);
        String answer = String.valueOf(date).substring(0,3).toUpperCase();
        
        return answer;
    }
}