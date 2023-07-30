class Solution {
    public int solution(int n) {
        int answer = 0;
        for (int i = n; i >= 2; i--) {
            int cnt = 0;
            int num = i;
            for (int j = 2; j <= num; j++) {              
                while (num % j == 0) {
                    cnt++;       
                    num /= j;                              
                }  
            }
            if (cnt > 1) answer++;
        }
        return answer;
}

}
