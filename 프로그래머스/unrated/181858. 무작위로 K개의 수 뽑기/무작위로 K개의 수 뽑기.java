import java.util.*;
class Solution {
    public int[] solution(int[] arr, int k) {
        LinkedHashSet<Integer> lhs = new LinkedHashSet<>();
        for (int x : arr) {
            lhs.add(x);
            if (lhs.size() == k) break;
        }   

        List<Integer> list = new ArrayList<Integer>(lhs);
        int rest = k - lhs.size();
        while (rest > 0) {
            list.add(-1);
            rest--;
        }   
        return list.stream().mapToInt(i -> i).toArray();
    }
}