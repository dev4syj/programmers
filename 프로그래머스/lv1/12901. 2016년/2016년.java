class Solution {
    public String solution(int a, int b) {
        String answer = "";
        // 한 주는 금요일 부터 시작
        String[] date = {"FRI","SAT","SUN","MON","TUE","WED","THU"};
        int[] month = {31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        int day = 0;
        for (int i = 0; i < a - 1; i++) { // a월 바로 앞달까지만 일수 누적합
            day += month[i];
        }
        day += b - 1; // 해당 월 일수 더하기
        return date[day % 7];
    }
}