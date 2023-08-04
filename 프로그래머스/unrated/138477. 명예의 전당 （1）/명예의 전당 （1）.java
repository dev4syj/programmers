import java.util.*;
class Solution {
    public int[] solution(int k, int[] score) {
        int[] answer = new int[score.length];
        List<Integer> list = new ArrayList<>();
        int idx = 0;
        for (int x : score) {
            list.add(x);
            Collections.sort(list);
            if (list.size() <= k) answer[idx] = list.get(0);
            else answer[idx] = list.get(list.size() - k);
            idx++;
        }
        return answer;
    }
}