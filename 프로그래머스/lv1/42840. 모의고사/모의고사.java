import java.util.*;
class Solution {
    public int[] solution(int[] answers) {
        List<Integer> list = new ArrayList<>();

        int[] human1 = {1, 2, 3, 4, 5};
        int[] human2 = {2, 1, 2, 3, 2, 4, 2, 5};
        int[] human3 = {3, 3, 1, 1, 2, 2, 4, 4, 5, 5};
        
        int h1_score = 0, h2_score = 0, h3_score = 0;
        for (int i = 0; i < answers.length; i++) {
            if (answers[i] == human1[i % 5]) h1_score++;
            if (answers[i] == human2[i % 8]) h2_score++;
            if (answers[i] == human3[i % 10]) h3_score++;
        }
        int max = Math.max(h1_score, h2_score);
        max = Math.max(max, Math.max(h2_score, h3_score));
        if (max == h1_score) list.add(1);
        if (max == h2_score) list.add(2);
        if (max == h3_score) list.add(3);

        return list.stream().mapToInt(Integer::intValue).toArray();
    }
}