class Solution {
    public int[] solution(int n, int[] numlist) {     
        int size = 0;
        for (int num : numlist) {
            if (num % n == 0) size++;
        }
        int[] answer = new int[size];
        int index = 0;
        for (int i = 0; i < numlist.length; i++) {
            if (numlist[i] % n == 0) {
                answer[index] = numlist[i];
                index++;
            }
        }
        return answer;
    }
}