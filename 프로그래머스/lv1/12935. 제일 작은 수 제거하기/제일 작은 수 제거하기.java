import java.util.*;
class Solution {
    public int[] solution(int[] arr) {
        if (arr.length == 1) return new int[] {-1};
        int[] answer = new int[arr.length - 1];
        int[] tmp = arr.clone();
        Arrays.sort(tmp);
        int min = tmp[0], idx = 0;
        for (int x : arr) {
            if (x != min) {
                answer[idx] = x;
                idx++;
            }
        }
        return answer;
    }
}