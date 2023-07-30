import java.util.*;
class Solution {
    public int[] solution(int[] arr, boolean[] flag) {
        Stack<Integer> stack = new Stack<>();
        for (int i = 0; i < arr.length; i++) {
            int cnt = arr[i];
            if (flag[i]) {  
                cnt *= 2;
                while (cnt > 0) {
                    stack.push(arr[i]);
                    cnt--;
                }              
            } else {
                while (cnt > 0) {
                    stack.pop();
                    cnt--;
                }
            }            
        }
        int[] answer = new int[stack.size()];
        int idx = 0;
        for (int n : stack) {
            answer[idx] = n;
            idx++;
        }
        return answer;
    }
}