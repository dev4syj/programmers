import java.util.*;
class Solution {
    public int[] solution(int n) {
       
        ArrayList<Integer> list = new ArrayList<>();
        while (n != 1) {
            if (n % 2 == 0) {
                list.add(n);
                n /= 2;
            } else {
                list.add(n);
                n = n * 3 + 1; 
            } 
        }
        list.add(1);
        int[] answer = list.stream().mapToInt(i -> i).toArray();
        return answer;
    }
}