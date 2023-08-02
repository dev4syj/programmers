import java.util.*;
class Solution {
    public int[] solution(int[][] score) {
        int[] answer = new int[score.length];
        int[] sum = new int[score.length]; // 점수 합산

        for (int i = 0; i < score.length; i++) {
            sum[i] = score[i][0] + score[i][1];
        }
        
        // 순위 지정
        for (int i = 0; i < answer.length; i++) {
            answer[i] = 1;
            for (int j = 0; j < answer.length; j++) {
                if (sum[i] < sum[j]) answer[i]++;
                // 자기보다 점수가 높은 경우가 있을 경우 +1 -> 동점자 처리 가능
            }
        }       
        return answer;
    }
}