import java.util.*;
class Solution {
    public int solution(String[] strArr) {
        Map<Integer, Integer> hp = new HashMap<>();
        for (String str : strArr) {
            int len = str.length();
            hp.put(len, hp.getOrDefault(len, 0) + 1);
        } 
        return Collections.max(hp.values());
    }
}