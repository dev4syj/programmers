class Solution {
    public int solution(int[] num_list) {
        int answer = 0;
        int len = num_list.length;
        if (len >= 11) {
            for (int x : num_list) {
                answer += x;
            }
        } else {
            answer++;
            for (int x : num_list) {
                answer *= x;
            }
        }
        return answer;
    }
}