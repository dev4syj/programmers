import java.util.*;
class Solution {
    public int[] solution(String[] keyinput, int[] board) {
        int[] answer = {0, 0};
        int limit1 = (Math.abs(board[0]) - 1) / 2;
        int limit2 = (Math.abs(board[1]) - 1) / 2;
        for (String s : keyinput) {
            if (s.equals("left") && Math.abs(answer[0] - 1) <= limit1) answer[0]--;             
            if (s.equals("right") && Math.abs(answer[0] + 1) <= limit1) answer[0]++;
            if (s.equals("up") && Math.abs(answer[1] + 1) <= limit2) answer[1]++;
            if (s.equals("down") && Math.abs(answer[1] - 1) <= limit2) answer[1]--; 
        }
        return answer;
    }
}