class Solution {
    int getGCD(int a, int b) {
        if (b == 0) return a;
        return getGCD(b, a % b);
    }
    
    public int solution(int a, int b) {
        int gcd = getGCD(a, b);
        b /= gcd;
        if (b == 1) return 1;
        int i = 2;
        String tmp = "";
        while (b >= i) {
            if (b % i == 0) {
                tmp += i + "";
                b /= i;
            } else i++;
        }
        tmp = tmp.replace("2", "").replace("5", "").replace("1", "");
        if (tmp.equals("")) return 1;
        return 2;   
    }
}