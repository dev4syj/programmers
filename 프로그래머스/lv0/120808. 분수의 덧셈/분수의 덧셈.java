class Solution {
    public int[] solution(int denum1, int num1, int denum2, int num2) {
        int denum = denum1 * num2 + denum2 * num1;
        int num = num1 * num2;

        int gcd = getGCD(denum, num);

        return new int[]{denum / gcd, num / gcd};
    }

    public int getGCD(int a, int b) {
        if (a % b == 0) {
            return b;
        }

        return getGCD(b, a%b);
    }
}