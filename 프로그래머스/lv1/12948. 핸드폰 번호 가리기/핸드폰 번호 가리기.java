class Solution {
    public String solution(String phone_number) {
        String answer = "";
        String s = "";
        
        String str1 = phone_number.substring(phone_number.length()-4,phone_number.length());
        
        for (int i = 0; i<phone_number.length()-4; i++){
            s += "*";
        }
        
        answer = s + str1;
        
        return answer;
    }
}