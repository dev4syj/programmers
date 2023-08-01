import java.util.*;
class Solution {
    public String solution(String[] cards1, String[] cards2, String[] goal) {
        int c1 = 0;
        int c2 = 0;
        
        for (String str : goal) {
            if (cards1[c1].equals(str)) {
                c1++;
                if (c1 >= cards1.length) c1 = cards1.length - 1;
            }
            else if (cards2[c2].equals(str)) {
                c2++;
                if (c2 >= cards2.length) c2 = cards2.length - 1;
            }
            else return "No";
        }
        return "Yes";
    }
}