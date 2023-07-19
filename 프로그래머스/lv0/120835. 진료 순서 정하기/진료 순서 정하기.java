import java.util.*;
class Solution {
    public int[] solution(int[] emergency) {
        int[] answer = new int[emergency.length];
        int value = 0;
        Map<Integer, Integer> mp = new HashMap<Integer, Integer>();
        for (int num : emergency) {
            mp.put(num, value);
            value++;
        }
        int index = 0;
        Arrays.sort(emergency);
        mp.entrySet();
        
        for (int num2 : emergency) {
            answer[mp.get(emergency[index])] = emergency.length - index;
            index++;
        }
        return answer;
    }
}