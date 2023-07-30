import java.util.*;
class Solution {
    public int[] solution(String my_string) {
        int[] answer = new int[52];
        HashMap<Character, Integer> hm = new HashMap<>();
        for (int i = 65; i < 91; i++) hm.put((char)i, 0);
        for (int i = 97; i < 123; i++) hm.put((char)i, 0);
        for (char ch : my_string.toCharArray()) hm.put(ch, hm.getOrDefault(ch, 0) + 1);

        return hm.values().stream().mapToInt(i -> i).toArray();
    }
}