import java.util.*;
class Solution {
    public String solution(String[] cards1, String[] cards2, String[] goal) {
        int c1 = 0;
        int c2 = 0;
        
        for (String str : goal) {
            if (cards1[c1].equals(str)) {
                c1++;
                if (c1 >= cards1.length) c1 = cards1.length - 1;
            }
            else if (cards2[c2].equals(str)) {
                c2++;
                if (c2 >= cards2.length) c2 = cards2.length - 1;
            }
            
            else return "No";
        }
        
        
//         HashMap<String, Integer> hm = new HashMap<>();
//         for (int i = 0; i < cards1.length; i++) hm.put(cards1[i], i);
//         for (int j = 0; j < cards2.length; j++) hm.put(cards2[j], j);

//         int[] order = new int[goal.length];
        
//         for (int k = 0; k < goal.length; k++) {
//             order[k] = hm.get(goal[k]);
//         }
        
//         int[] sorted = order.clone();
//         Arrays.sort(sorted);
        
//         if (Arrays.equals(order, sorted)) return "Yes";
         
            return "Yes";
    }
}