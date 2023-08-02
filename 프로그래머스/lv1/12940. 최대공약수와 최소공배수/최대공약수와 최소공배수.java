import java.util.*;
class Solution {
    
    public int 유클리드호제법(int n, int m) {
        if (m == 0) return n;
        return 유클리드호제법(m, n % m);
    }
    
    public int[] solution(int n, int m) {
        int[] answer = new int[2];
        answer[0] = 유클리드호제법(n, m);
        answer[1] = n * m / answer[0];
        return answer;
    }
}