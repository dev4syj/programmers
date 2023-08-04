class Solution {
    public int solution(int a, int b, int n) {
        int answer = 0;
        int service = 0, rest = n;
        while (rest >= a) {
            service = rest / a * b;
            answer += service;
            rest = rest % a + service;
        }
        return answer;
    }
}