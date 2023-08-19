class Solution {
    public int solution(int[][] sizes) {
        int answer = 0;
        
        int larger =0;
        int smaller =0;
        
        for(int i=0; i<sizes.length; i++){
            
           int max = Math.max(sizes[i][0], sizes[i][1]);
           int min = Math.min(sizes[i][0], sizes[i][1]);
            // 계속 max,min값이 덮여짐 -> 비교하면서 최신화
            
            larger = Math.max(max, larger);
            smaller = Math.max(min, smaller);
            
        }
        answer = larger * smaller;
        
        return answer;
    }
}