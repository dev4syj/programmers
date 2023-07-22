class Solution {
    public int[] solution(int num, int total) {
        int[] answer = new int[num];
        
        int center = (int)(total / num);
        int len = answer.length;
        int center_index = 0;

        // 길이 따라 중앙값 인덱스 구별
        if (answer.length % 2 == 0) {
            center_index = len / 2 - 1;
        } else {
            center_index = len / 2;
        }
        
        // center 설정
        answer[center_index] = center;
        
        // center 왼쪽
        int n = 1;
        for (int i = center_index - 1; i >= 0; i--) {
            answer[i] = center - n;
            n++;
        }

        // center 오른쪽
        int m = 1;
        for (int j = center_index + 1; j < answer.length; j++) {
            answer[j] = center + m;
            System.out.println(j + " - " + answer[j]);
            m++;
        }       
        return answer;
    }
}