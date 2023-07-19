import java.util.*;
class Solution {
    public int solution(String my_string) {
        int answer = 0;
        String tmp = my_string.replaceAll("[^0-9]", "-");

        for (String str : tmp.split("-")) {
            if (!str.equals("")) {
                int num = Integer.parseInt(str);
                answer += num;
            }
        }
        return answer;
    }
}