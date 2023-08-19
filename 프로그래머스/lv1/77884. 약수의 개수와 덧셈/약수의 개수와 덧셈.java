class Solution {
    public int solution(int left, int right) {
        int answer = 0;
        
        int[] a = new int[right-left +1];
        int index = 0;
        
        for(int i =left; i<right+1; i++){
            a[index] = i;
            index++;
        }
        
        int count = 0;
        for(int i = 0; i<a.length; i++){
            for(int j=1; j<=a[i]; j++){
                if(a[i]%j == 0){
                    count ++;
                } 
            }
            if(count%2 == 0){
                answer+= a[i];
            } else {
                answer-= a[i];
            }
            count = 0;
        }
        
        return answer;
    }
}