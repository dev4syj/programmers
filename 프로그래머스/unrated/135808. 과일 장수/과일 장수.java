import java.util.*;
class Solution {
    public int solution(int k, int m, int[] score) {
        int answer = 0;
        if (score.length < m) return 0; // 이익이 발생하지 않는 경우
        
        // 내림차순 정렬
        Integer[] arr = Arrays.stream(score).boxed().toArray(Integer[]::new);
        Arrays.sort(arr, Collections.reverseOrder());
        
        int limit = (score.length / m) * m; // 남은 사과 버림
        
        for (int i = 0; i < limit; i += m) {
            answer += arr[i + m - 1] * m;
        }
        return answer;
    }
}