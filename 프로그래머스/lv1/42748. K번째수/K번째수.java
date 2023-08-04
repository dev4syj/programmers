import java.util.*;
class Solution {
    public int[] solution(int[] array, int[][] commands) {
        int[] answer = new int[commands.length];
        int idx = 0;
        for (int[] arr : commands) {
            int[] tmp = new int[arr[1] - arr[0] + 1];
            for (int i = arr[0] - 1; i < arr[1]; i++) {
                tmp[i - (arr[0] - 1)] = array[i];
            }
            Arrays.sort(tmp);
            answer[idx] = tmp[arr[2] - 1];
            idx++;
        }
        return answer;
    }
}