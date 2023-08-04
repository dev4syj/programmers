import java.util.*;
class Solution {
    public int solution(int[] rank, boolean[] attendance) {
        List<Integer> list = new ArrayList<>();
        HashMap<Integer, Integer> hm = new HashMap<>();
        for (int i = 0; i < rank.length; i++) {
            if (attendance[i]) {
                hm.put(rank[i], i);
                list.add(rank[i]);
            } 
        }
        Collections.sort(list);
        return hm.get(list.get(0)) * 10000 + hm.get(list.get(1)) * 100 + hm.get(list.get(2));
    }
}