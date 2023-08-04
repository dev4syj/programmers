import java.util.*;
class Solution {
    public int[] solution(String[] name, int[] yearning, String[][] photo) {
        int[] answer = new int[photo.length];
        Map<String, Integer> hm = new HashMap<>();
        for (int i = 0; i < name.length; i++) {
            hm.put(name[i], yearning[i]);
        }
        int idx = 0;
        for (String[] arr : photo) {
            for (String s : arr) {
                if (hm.getOrDefault(s, 0) > 0) answer[idx] += hm.get(s);
            }
            idx++;
        }
        return answer;
    }
}