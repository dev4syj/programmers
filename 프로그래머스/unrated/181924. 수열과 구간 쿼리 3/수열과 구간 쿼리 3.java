class Solution {
    public int[] solution(int[] arr, int[][] queries) {
        int tmp = 0;
        for (int[] x : queries) {
            tmp = arr[x[0]];
            arr[x[0]] = arr[x[1]];
            arr[x[1]] = tmp;
        }
        return arr;
    }
}