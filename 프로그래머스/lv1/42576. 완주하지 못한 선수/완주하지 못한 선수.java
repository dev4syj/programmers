import java.util.*;
class Solution {
    public String solution(String[] participant, String[] completion) {
        String answer = "";
        HashMap<String, Integer> map = new HashMap<>();

    for(String parti : participant){
     map.put(parti,map.getOrDefault(parti,0)+1);
    }

    for(String m : completion){
        map.put(m,map.get(m)-1);
    }
    for(String m : map.keySet()){
        if(map.get(m) == 1){
        answer = m;
        }
    }
        
        return answer;
    }
}