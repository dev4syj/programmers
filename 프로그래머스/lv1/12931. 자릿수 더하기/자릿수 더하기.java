import java.util.*;

public class Solution {
    public int solution(int n) {
        int answer = 0;
        String number = n + "";
        for (String s : number.split("")) answer += Integer.parseInt(s);
        return answer;
    }
}