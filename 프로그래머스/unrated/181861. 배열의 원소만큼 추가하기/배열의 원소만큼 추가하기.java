class Solution {
    public int[] solution(int[] arr) {
        int len = 0;
        for (int x : arr) {
            len += x;
        }
        int[] answer = new int[len];
        int idx = 0, cnt = 0;
        for (int i = 0; i < len; i++) {
            answer[i] = arr[idx];
            cnt++;
            if (cnt == answer[i]) {
                idx++;
                cnt = 0;
            }   
        }
        return answer;
    }
}