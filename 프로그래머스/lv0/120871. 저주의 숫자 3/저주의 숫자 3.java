import java.util.*;
class Solution {
    public int solution(int n) {
        int idx = 1, num = 0;
        String tmp = "";
        while (idx <= n) {
            tmp = num + "";
            if (tmp.contains("3") || num % 3 == 0) {
                num++;
            } else {
                idx++;
                num++;
            }
        }
        return num - 1;
    }
}