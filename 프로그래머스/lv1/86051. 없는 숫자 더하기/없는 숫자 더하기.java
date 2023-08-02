class Solution {
    public int solution(int[] numbers) {
        int answer = 0;
        String str = "";
        for (int x : numbers) str += x + "";
        for (int i = 1; i <= 9; i++) {
            String number = i + "";
            if (!str.contains(number)) answer += i;
        }
        return answer;
    }
}