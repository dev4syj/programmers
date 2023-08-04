import java.util.*;
class Solution {
    public int[] solution(int l, int r) {
        List<Integer> list = new ArrayList<>();
        
        for (int i = 1; i < r; i++) {
            String tmp = Integer.toBinaryString(i);
            int number = Integer.parseInt(tmp) * 5;
            if (number >= l && number <= r) list.add(number);
            if (number > r) break;
        }
        if (list.size() == 0) return new int[] {-1};
        return list.stream().mapToInt(n -> n).toArray();
    }
}