import java.util.*;
class Solution {
    public int[] solution(int[] arr) {
        int len = arr.length;
        if(len == 1) return arr;
        int num = 2;
        while (num < len) {
            num *= 2;
        }
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < num; i++) {
            if (i < len) list.add(arr[i]);
            else list.add(0);
        }
        return list.stream().mapToInt(i -> i).toArray();
    }
}