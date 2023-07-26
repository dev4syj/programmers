class Solution {
    public String solution(String myString) {
        String answer = "";
        for (char ch : myString.toCharArray()) {
            if ((int)ch < (int)'l') answer += String.valueOf('l');
            else answer += String.valueOf(ch);
        }
        return answer;
    }
}