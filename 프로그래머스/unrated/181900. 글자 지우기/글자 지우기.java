import java.util.*;
class Solution {
    public String solution(String my_string, int[] indices) {
        String answer = "";
        Arrays.sort(indices);
        int idx = 0;
        int cnt = 0;
        for (String str : my_string.split("")) {
            if (indices[idx] == cnt) {
                if (idx < indices.length - 1) idx++;
                else idx = indices.length - 1;
            }              
            else answer += str;          
            cnt++;
        }
        return answer;
    }
}