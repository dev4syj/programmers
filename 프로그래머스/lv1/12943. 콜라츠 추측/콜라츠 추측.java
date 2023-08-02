class Solution {
    public int solution(int num) {
        int answer = 0;      
        long l = (long)num;
        
        if (num == 1) return 0;
        
        while (l != 1) {
            if (l % 2 == 0) l /= 2;
            else l = l * 3 + 1;
            answer++;
            if (answer > 500) return -1;
        }
        return answer;
    }
}