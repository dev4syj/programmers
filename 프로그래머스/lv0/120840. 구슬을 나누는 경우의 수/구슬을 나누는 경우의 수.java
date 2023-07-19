import java.util.*;
class Solution {
    public int solution(int balls, int share) {
        // Calculate the minimum value of share and balls-share
        int minShare = Math.min(share, balls - share);

        // Initialize the result to 1
        long result = 1;

        // Calculate the combination using the formula
        for (int i = 1; i <= minShare; i++) {
            result = result * (balls - i + 1) / i;
        }

        return (int) result;
    }
}