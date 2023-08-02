class Solution {
    public String solution(String s) {
        String answer = "";
        int idx = 0;
        for (String str : s.split("")) {
            if (str.equals(" ")) {
                answer += str;
                idx = 0;
            } else if (idx % 2 != 0) {
                answer += str.toLowerCase();
                idx++;
            } else if (idx % 2 == 0) {
                answer += str.toUpperCase();
                idx++;
            }  
        }
        return answer;
    }
}