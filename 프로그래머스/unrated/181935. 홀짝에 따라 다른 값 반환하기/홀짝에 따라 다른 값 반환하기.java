class Solution {
    public int solution(int n) {
        int answer = 0;
        int odd = 1;
        int even = 2;
        if (n % 2 != 0) {
            while (odd != n + 2) {
                answer += odd;
                odd += 2;
            }  
        } else {
            while (even != n + 2) {
                answer += even * even;
                even += 2;
            }
        }
        return answer;
    }
}