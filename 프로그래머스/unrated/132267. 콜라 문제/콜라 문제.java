class Solution {
    public int solution(int a, int b, int n) {
        int answer = 0;
        if (n < a) return 0;
        else {
            int service = 0, rest = n;
            while (rest >= a) {
                service = rest / a * b;
                answer += service;
                rest = rest % a + service;
            }
        }
        return answer;
    }
}