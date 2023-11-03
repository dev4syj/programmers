class Solution {
    public int solution(int n, int m, int[] section) {
        int answer = 1;
        int start = 0;
        
        for (int j = start + 1; j < section.length; j++) {
            int paint = section[j] - section[start];
            if (paint >= m) {
                answer++;
                start = j;
            }          
        }
        return answer;
    }
}