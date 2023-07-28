import java.util.*;
class Solution {
    public int[] solution(String myString) {
        List<Integer> list = new ArrayList<>();
        for (String s : myString.split("x")) {
            list.add(s.length());
        }
        if (myString.substring(myString.length() - 1).equals("x")) list.add(0);
        int answer[] = new int[list.size()];
        int idx = 0;
        for (int x : list) {
            answer[idx] = x;
            idx++;
        }
        return answer;
    }
}