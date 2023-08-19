class Solution {
    public String solution(String s, int n) {
        String answer = "";
        
        String[] A = {"A","B","C","D","E","F","G","H","I","J","K","L","M","N","O","P","Q","R","S","T","U","V","W","X","Y","Z"};
        String[] a = {"a","b","c","d","e","f","g","h","i","j","k","l","m","n","o","p","q","r","s","t","u","v","w","x","y","z"};

        
        String[] sArr = s.split("");
        
        for(int i=0; i<sArr.length; i++){
            boolean matched = false;
            
            for(int j=0; j<a.length; j++){
                if(sArr[i].equals(A[j])){
                    answer += A[(j+n)%26];
                    matched = true;
                    break;       
                } else if(sArr[i].equals(a[j])){
                    answer += a[(j+n)%26];
                    matched = true;
                    break;
                } 
        } 
        if(!matched){
             answer+= " ";
        }            
    }
    return answer;
    }
}