class Solution {
    public int solution(int a, int b, int n) {
        int answer = 0;
        
        while(n>=a){
            int empty = n/a;
            answer += empty *b;
            n= n % a + empty * b; 
        }
        
        
        return answer;
    }
}