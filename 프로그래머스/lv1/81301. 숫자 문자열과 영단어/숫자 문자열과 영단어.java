class Solution {
    public int solution(String s) {
        int answer = 0;
        int index = 0;
       
        
        String[] numbers = {"0","1","2","3","4","5","6","7","8","9"};
        String[] words = {"zero","one","two","three","four","five","six","seven","eight","nine"};
        
        String s2 = "";
        
        for(int i=1; i<=s.length(); i++){
            for(int j=0; j<numbers.length; j++){
                if(s.substring(index,i).contains(numbers[j])){
                    s2 += numbers[j];
                    index ++;
                    break;
                } else if(s.substring(index,i).contains(words[j])){
                    s2 += numbers[j];
                    index += words[j].length();
                    break;
                }
            }     
        }
        answer = Integer.parseInt(s2);
        
        
        return answer;
    }
}