import java.util.*;
class Solution {
    public int[] solution(int[] arr) {
        List<Integer> list = new ArrayList<>();
        int idx = 0;
        while (idx != arr.length) {
            int size = list.size();
            if (size == 0) {
                list.add(arr[idx]);
                idx++;
            } else if (list.get(size - 1) < arr[idx]){  
                list.add(arr[idx]);
                idx++;
            } else if (list.get(size - 1) >= arr[idx]) {
                list.remove(size - 1);
            }
                
        }
        return list.stream().mapToInt(i -> i).toArray();
    }
}