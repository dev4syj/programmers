class Solution {
    public String solution(String my_string, int[][] queries) {
        String[] str_arr = my_string.split("");
        
        for (int[] x : queries) {
            int limit = (x[1] - x[0]) / 2 + 1;
            
            for (int i = 0; i < limit; i++) {
                String tmp = str_arr[x[1] - i];
                str_arr[x[1] - i] = str_arr[x[0] + i];
                str_arr[x[0] + i] = tmp;
            }
        }
        return String.join("", str_arr);
    }
}