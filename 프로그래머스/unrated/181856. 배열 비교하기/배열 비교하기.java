import java.util.*;
class Solution {
    public int solution(int[] arr1, int[] arr2) {
        int len1 = arr1.length;
        int len2 = arr2.length;
        
        int sum1 = Arrays.stream(arr1).sum();
        int sum2 = Arrays.stream(arr2).sum();
        
        if (len1 < len2) return - 1;
        else if (len1 > len2) return 1;
        else {
            if (sum1 == sum2) return 0;
            else if (sum1 < sum2) return - 1;
            else return 1;
        }
    }
}