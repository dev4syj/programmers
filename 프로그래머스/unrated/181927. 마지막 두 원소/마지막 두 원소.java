class Solution {
    public int[] solution(int[] num_list) {
        int len = num_list.length;
        int[] answer = new int[len + 1];
        for (int i = 0; i < len; i++) {
            answer[i] = num_list[i];
        }
        int n1 = num_list[len - 1];
        int n2 = num_list[len - 2];
        if (n1 > n2) answer[len] = n1 - n2;
        else answer[len] = n1 * 2;
        return answer;
    }
}