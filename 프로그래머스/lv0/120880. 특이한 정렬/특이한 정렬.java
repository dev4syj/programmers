import java.util.*;
class Solution {
    
    public int[] solution(int[] numlist, int n) {
        int[] answer = new int[numlist.length];
        Map<Integer, Integer> mp = new HashMap<>();
        for (int num : numlist) {
            mp.put(num, Math.abs(num - n));
        }
        
        // value 비교해서 같은 지 비교
        // value 다르면 그대로 반환
        // 만약 같다면 0반환 -> key값 내림차 순 정렬
        Comparator<Integer> cp = (x, y) -> {
            int cmp = mp.get(x).compareTo(mp.get(y));
            return cmp != 0 ? cmp : Integer.compare(y, x);
        };
        
        // key 값만 담기
        List<Integer> keySet = new ArrayList<>(mp.keySet());
        // key별 value 값 정렬
        Collections.sort(keySet, cp);
        
        int i = 0;
        for (int x : keySet) {
            answer[i] = x;
            i++;
        }
        return answer;
    }
}