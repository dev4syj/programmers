class Solution {
    public String[] solution(int n, int[] arr1, int[] arr2) {
        int len = arr1.length;
        String[] bi1 = new String[len];
        String[] bi2 = new String[len];
        int max_len = Integer.MIN_VALUE; // 전체 지도 최대 크기
        
        // 이진수로 바꾸기
        for (int i = 0; i < len; i++) {
            bi1[i] = Integer.toBinaryString(arr1[i]);
            bi2[i] = Integer.toBinaryString(arr2[i]);
            max_len = Math.max(max_len, Math.max(bi1[i].length(), bi2[i].length()));
        }

        // 변환하기
        String[] code = new String[len];
        for (int i = 0; i < len; i++) {
            bi1[i] = "0".repeat(max_len - bi1[i].length()) + bi1[i];
            bi2[i] = "0".repeat(max_len - bi2[i].length()) + bi2[i];
            String tmp = "";
            for (int j = 0; j < max_len; j++) {
                if (bi1[i].charAt(j) == '1' || bi2[i].charAt(j) == '1') tmp += "#";
                else tmp += " ";
            }
            code[i] = tmp;  
        } 
        return code;
    }
}