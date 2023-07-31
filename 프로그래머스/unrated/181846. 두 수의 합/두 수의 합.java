import java.math.*;
class Solution {
    public String solution(String a, String b) {
        BigInteger big = new BigInteger(a);
        BigInteger big2 = new BigInteger(b);
        big = big.add(big2);
        return big.toString();
    }
}