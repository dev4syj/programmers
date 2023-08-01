class Solution {
    public int solution(int n) {
        int answer = n;
        int number = n / 2;
        while (number > 0) {
            if (n % number == 0) answer += number;
            number--;      
        }
        return answer;
    }
}