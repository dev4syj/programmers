import java.util.*;
class Solution {
    public int[] solution(int[] arr, int[] delete_list) {
        List<Integer> list = new ArrayList<>();
        int cnt = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < delete_list.length; j++) {
                if (arr[i] == delete_list[j]) cnt++;
            }
            if (cnt == 0) {
                list.add(arr[i]);
            }
            cnt = 0;     
        }
        int[] answer = new int[list.size()];
        int idx = 0;
        for (int x : list) {
            answer[idx] = x;
            idx++;
        }
        return answer;
    }
}