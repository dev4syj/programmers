import java.util.*;
class Solution {
    public int[] solution(String s) {
        int[] answer = new int[s.length()];
        Stack<String> stack = new Stack<>();
        String[] arr = s.split("");
        for (int i = 0; i < arr.length; i++) {
            answer[i] = stack.search(arr[i]);
            stack.push(arr[i]);
        }
        return answer;
    }
}