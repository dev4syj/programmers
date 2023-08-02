import java.util.*;
class Solution {
    public int solution(int[] d, int budget) {
        int answer = 0;
        int sum = Arrays.stream(d).sum();
        if (budget >= sum) return d.length;
        Arrays.sort(d);
        for (int i = 0; i < d.length; i++) {
            if (budget == 0 || budget - d[i] < 0) break;
            budget -= d[i];
            answer++;
        }
        return answer;
    }
}