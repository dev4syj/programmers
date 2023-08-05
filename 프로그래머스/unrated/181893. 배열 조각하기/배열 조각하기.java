import java.util.*;
class Solution {
    public int[] solution(int[] arr, int[] query) {
        List<Integer> list = new ArrayList<>();
        int start = 0, end = 0;
        for (int i = 0; i < query.length; i++) {
            if (i % 2 == 0) {
                end = start + query[i];
            } else {
                start += query[i];
            }
        }
        for (int i = start; i <= end; i++) {
            list.add(arr[i]);
        }
        return list.stream().mapToInt(Integer::intValue).toArray();

    }
}