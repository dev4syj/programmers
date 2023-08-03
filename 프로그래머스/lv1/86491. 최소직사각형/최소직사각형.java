class Solution {
    public int solution(int[][] sizes) {
        // 모두 '가로 > 세로' 되도록 정렬
        for (int[] arr : sizes) {
            if (arr[0] < arr[1]) {
                int tmp = arr[0];
                arr[0] = arr[1];
                arr[1] = tmp;
            }
        }
        int w_max = Integer.MIN_VALUE;
        int h_max = Integer.MIN_VALUE;
        // 가로, 세로 중 최대값 선택
        for (int[] arr : sizes) {
            if (arr[0] > w_max) w_max = arr[0];
            if (arr[1] > h_max) h_max = arr[1];
        }
        return w_max * h_max;
    }
}