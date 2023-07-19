import java.util.*;
class Solution {
    public int solution(int i, int j, int k) {
        int answer = 0;
        String str_format = "*";
        for (int n = i; n <= j; n++) {
            str_format += n;
        }

        for (String str : str_format.split("")) {
            if (str.equals(String.valueOf(k))) answer++;
        }
        return answer;
    }
}