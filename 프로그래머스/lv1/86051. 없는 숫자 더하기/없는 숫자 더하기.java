class Solution {
    public int solution(int[] numbers) {
        int answer = 0;
        int sum = 0;
        
        for(int i = 0; i<numbers.length; i++){
            for(int j = 1; j<10; j++){
                if(numbers[i] == j){
                    sum +=j;
                } else {
                    continue;
                }
            }
            int total = 1+2+3+4+5+6+7+8+9;
            answer = total - sum;
        }
        
        return answer;
    }
}