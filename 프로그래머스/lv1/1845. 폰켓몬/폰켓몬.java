import java.util.*;
class Solution {
    public int solution(int[] nums) {
        int cnt = nums.length / 2;
        HashMap<Integer, Integer> hm = new HashMap<>();
        for (int num : nums) {
            hm.put(num, hm.getOrDefault(num, 0) + 1);
        }
        int cnt2 = 0;
        for (int num2 : hm.keySet()) {
            cnt2++;
        }
        if (cnt >= cnt2) return cnt2;
        return cnt;
    }
}