class Solution {
    boolean solution(String s) {
        boolean answer = true;
        s = s.toLowerCase();
        if (!s.contains("p") && !s.contains("y")) return answer;
        int p_cnt = 0, y_cnt = 0;
        for (String str : s.split("")) {
            if (str.equals("p")) p_cnt++;
            else if (str.equals("y")) y_cnt++;
        }
        if (p_cnt != y_cnt) answer = false;
        return answer;
    }
}