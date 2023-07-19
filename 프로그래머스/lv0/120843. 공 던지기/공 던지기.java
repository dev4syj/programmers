class Solution {
    public int solution(int[] numbers, int k) {
        int index = 0;
        int len = numbers.length;
        for (int i = 0; i < k - 1; i++) {
            index += 2;
            if (index >= len) {
                index -= len;
            }       
        }
        return numbers[index];
    }
}