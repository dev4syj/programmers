import java.util.*;
class Solution {
    
    public void swap(String[] arr, int a, int b) {
        String tmp = arr[a];
        arr[a] = arr[b];
        arr[b] = tmp;
    }
    
    public String[] solution(String[] strings, int n) {
        Arrays.sort(strings);
        for (int i = 0; i < strings.length; i++) {
            for (int j = 0; j < strings.length - 1; j++) {
                if (strings[j].charAt(n) > strings[j + 1].charAt(n)) {
                        swap(strings, j, j + 1);
                }
            }
        }
        return strings;
    }
}