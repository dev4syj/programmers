import java.util.*;
class Solution {
    public String[] solution(String[] picture, int k) {
        List<String> list = new ArrayList<>();
        String dot = ".".repeat(k);
        String x = "x".repeat(k);
        for (int i = 0; i < picture.length; i++) {
            String tmp = picture[i].replace(".", dot).replace("x", x);
            for (int j = 0; j < k; j++) list.add(tmp);
        }
        return list.toArray(new String[list.size()]);
    }
}