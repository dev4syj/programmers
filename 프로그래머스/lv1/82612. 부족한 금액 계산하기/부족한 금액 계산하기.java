class Solution {
    public long solution(int price, int money, int count) {
        long won = (long)money;
        for (int i = 1; i <= count; i++) {
            won -= (long)(i * price);
        }
        if (won >= 0) return 0;
        return Math.abs(won);
    }
}