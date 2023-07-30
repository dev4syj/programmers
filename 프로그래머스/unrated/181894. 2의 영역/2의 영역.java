import java.util.*;
class Solution {
    public int[] solution(int[] arr) {
        List<Integer> list = new ArrayList<>();
        int start = -1;
        int end = -1;      
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 2) {
                if (start == -1) start = i;
                end = i;
            }
        }
        if (start == -1) {
            list.add(-1);
        } else {
            for (int i = start; i <= end; i++) {
                list.add(arr[i]);
            }
        }
        return list.stream().mapToInt(i -> i).toArray();
    }
}