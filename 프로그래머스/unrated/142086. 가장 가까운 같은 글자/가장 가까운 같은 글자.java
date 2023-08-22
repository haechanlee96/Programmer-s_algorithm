class Solution {
    public int[] solution(String s) {
        int[] answer = new int[s.length()];
        
        String[] arr = s.split("");
        
        answer[0] = -1;
        
        for(int i=0; i<arr.length; i++){
            answer[i] = -1;
            for(int j=arr.length-1; j>=0; j--){
                if(i!=j && arr[i].equals(arr[j])){
                    if(i-j>0){
                        answer[i] = i-j;
                        break;
                    } 
                } 
            }
        }
        
        return answer;
    }
}