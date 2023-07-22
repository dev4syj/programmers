class Solution {
    public int solution(int[] common) {
        int answer = 0;
        int last = common.length - 1;
        if (common[0] + common[last] ==
           common[1] + common[last - 1]) {
            answer = common[last] + (common[1] - common[0]);
        } else {
            answer = common[last] * (common[1] / common[0]);
        }
        return answer;
    }
}