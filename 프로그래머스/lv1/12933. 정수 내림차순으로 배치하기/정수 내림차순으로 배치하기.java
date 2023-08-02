import java.util.*;
class Solution {
    public long solution(long n) {
        String str = n + "";
        String[] arr = str.split("");
        
        Arrays.sort(arr, Collections.reverseOrder());
        str = String.join("", arr);
        
        return Long.parseLong(str);
    }
}