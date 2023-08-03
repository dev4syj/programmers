class Solution {
    public String solution(String s, int n) {
        String answer = "";
        // a= 97, z = 122
        // A = 65, Z = 90
        // 대소문자 나눠서 char 숫자 넘어가는지 확인
        int idx = 0;
        for (char ch : s.toCharArray()) {
            int number = (int)(ch + n);
            if (ch == ' ') answer += " ";
            else if (Character.isUpperCase(ch)) {
                if (number > 90) {
                    idx = number - 90 - 1;
                    answer += String.valueOf((char)('A' + idx));
                } else {
                    answer += String.valueOf((char)(ch + n));    
                }
            } else if (Character.isLowerCase(ch)) {
                if (number > 122) {
                    idx = number - 122 - 1;
                    answer += String.valueOf((char)('a' + idx));
                } else {
                    answer += String.valueOf((char)(ch + n)); 
                }
            }
        }
        return answer;
    }
}