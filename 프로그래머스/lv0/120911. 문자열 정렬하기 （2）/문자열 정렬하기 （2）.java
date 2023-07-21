import java.util.*;
class Solution {
    public String solution(String my_string) {
        String answer = "";
        String[] list = my_string.toLowerCase().split("");
        Arrays.sort(list);
        for (String str : list) {
            answer += str;
        }
        return answer;
    }
}