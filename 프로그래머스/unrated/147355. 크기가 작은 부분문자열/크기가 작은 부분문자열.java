class Solution {
    public int solution(String t, String p) {
        int answer = 0;
        Long tn = 0L;
        Long pn = Long.parseLong(p);
        
        for(int i=0; i<=t.length()-p.length(); i++){
            tn = Long.parseLong(t.substring(i, i+p.length()));
            if(tn <= pn){
                answer +=1;
            } 
        }
        
        
        return answer;
    }
}