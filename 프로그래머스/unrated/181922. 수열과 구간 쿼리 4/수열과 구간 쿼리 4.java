class Solution {
    public int[] solution(int[] arr, int[][] queries) {
        int[] answer = arr;
        for (int[] x : queries) {
            int k = x[2];
            for (int i = x[0]; i <= x[1]; i++) {
                if (i % k == 0) answer[i]++;
            }
        }
        return answer;
    }
}