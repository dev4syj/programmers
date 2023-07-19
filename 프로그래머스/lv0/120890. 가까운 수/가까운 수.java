import java.util.*;
class Solution {
    public int solution(int[] array, int n) {
        int answer = 0;
        int min = Integer.MAX_VALUE;
        Arrays.sort(array);
        for (int num : array) {
            int tmp = Math.abs(n - num);
            if (min > tmp) {
                min = tmp;
                answer = num;
            }
        }
        return answer;
    }
}