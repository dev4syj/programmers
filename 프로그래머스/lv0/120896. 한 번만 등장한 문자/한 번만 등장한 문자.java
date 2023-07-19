import java.util.*;
class Solution {
    public String solution(String s) {
        String answer = "";
        String[] str_list = s.split("");
        Arrays.sort(str_list);
        for (int i = 0; i < str_list.length - 1; i++) {
            if (str_list[i].equals(str_list[i + 1])) {
                s = s.replaceAll(str_list[i], "-");
            }
        }
        s = s.replaceAll("-", "");
        String[] str_list2 = s.split("");
        Arrays.sort(str_list2);
        for (String str : str_list2) {
            answer += str;
        }
        return answer;
    }
}