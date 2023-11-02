class Solution {
    
    public int cntDivisor(int n) {
        int cnt = 0;
        for (int i = 1; i <= (int)Math.sqrt(n); i++){
            if (n % i == 0){
                if (n / i == i) {
                    cnt++;
                } else {
                    cnt += 2;
                }  
            }
        }
        return cnt;
    }
    
    public int solution(int number, int limit, int power) {
        int answer = 0;
        for (int i = 1; i <= number; i++) {
            int atk = cntDivisor(i);
            if (atk > limit) {
                answer += power;
            } else {
                answer += atk;
            }
        }
        return answer;
    }
}