import java.util.*;
class Solution {
    public int solution(int[] array) {
        HashMap<Integer, Integer> hm = new HashMap<>();
        for (int x : array) {
            hm.put(x, hm.getOrDefault(x, 0) +1);
        }
        int max = Integer.MIN_VALUE;
        List<Integer> list = new ArrayList<>();

        for (int num : hm.keySet()) {
            int value = hm.get(num);
            list.add(value);
        }
        Collections.sort(list);
        int len = list.size();
        if (len > 1) {
            System.out.println(list.get(len - 1) + " " + list.get(len - 2));
            if (list.get(len - 1) == list.get(len - 2)) return -1;
        }
        int largest = list.get(len - 1);
        int answer = 0;
        for (int num : hm.keySet()) {
            if (hm.get(num) == largest) {
                answer = num;
                break;
            } 
        }
        return answer;
    }
}