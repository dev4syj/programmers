import java.util.*;
class Solution {
    public String solution(String[] seoul) {
        HashMap<String, Integer> hm = new HashMap<>();
        for (int i = 0; i < seoul.length; i++) hm.put(seoul[i], i);
        String answer = "김서방은 " + hm.get("Kim") + "에 있다";
        return answer;
    }
}