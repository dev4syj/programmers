class Solution {
    public int[] solution(int[] arr, int k) {
        int[] answer = new int[arr.length];
        int i = 0;
        for (int num : arr) {
            if (k % 2 == 0) {
                answer[i] = num + k;  
                i++;
            } else {
                answer[i] = num * k;
                i++;
            } 
        }
        return answer;
    }
}