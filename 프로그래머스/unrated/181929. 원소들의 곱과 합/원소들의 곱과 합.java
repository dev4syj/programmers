import java.util.*;
class Solution {
    public int solution(int[] num_list) {
        int multi = 1, sum = 0;
        for (int num : num_list) {
            multi *= num;
            sum += num;
        }
        sum *= sum;
        if (multi < sum) return 1;
        return 0;
    }
}