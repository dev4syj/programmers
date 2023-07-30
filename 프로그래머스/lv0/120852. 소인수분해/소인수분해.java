import java.util.*;
class Solution {
    public int[] solution(int n) {
        List<Integer> list = new ArrayList<>();
        int num = 2;
        while (n >= num) {
            if (n % num == 0) {
                n /= num;
                list.add(num);
            } else {         
                num++;
            }            
        }
        return list.stream().distinct().mapToInt(i -> i).toArray();
    }
}