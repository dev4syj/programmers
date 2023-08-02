import java.util.*;
class Solution {
    public int[] solution(int[] arr, int divisor) {
        List<Integer> list = new ArrayList<>();
        for (int num : arr) {
            if (num % divisor == 0) list.add(num);
        }
        if (list.size() == 0) list.add(-1);
        Collections.sort(list);
        return list.stream().mapToInt(i -> i).toArray();
    }
}