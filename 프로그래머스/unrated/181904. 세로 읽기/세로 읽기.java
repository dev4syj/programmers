class Solution {
    public String solution(String my_string, int m, int c) {
        String tmp = "";
        for (int i = 0; i < my_string.length(); i += m) {
            tmp += " " + my_string.substring(0 + i, i + m);
        }
        tmp = tmp.trim();
        String answer = "";
        for (String str : tmp.split(" ")) {
            answer += str.substring(c - 1, c);
        }
        return answer;
    }
}