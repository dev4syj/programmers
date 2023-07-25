class Solution {
    public int solution(int a, int b) {
        String str = a + "" + b;
        int num = Integer.parseInt(str);
        if (num >= 2 * a * b) return num;
        return 2 * a * b;
    }
}