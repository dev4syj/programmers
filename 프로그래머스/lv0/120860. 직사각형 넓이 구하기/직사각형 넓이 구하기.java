class Solution {
    public int solution(int[][] dots) {
        int answer = 0;
        int x_min = Integer.MAX_VALUE;
        int x_max = Integer.MIN_VALUE;
        int y_min = Integer.MAX_VALUE;
        int y_max = Integer.MIN_VALUE;
        for (int[] arr : dots) {
            x_min = Math.min(arr[0], x_min);
            x_max = Math.max(arr[0], x_max);
            y_min = Math.min(arr[1], y_min);
            y_max = Math.max(arr[1], y_max);
        }
        return (x_max - x_min) * (y_max - y_min);
    }
}