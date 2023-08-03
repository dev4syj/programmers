class Solution {
    public String[] solution(int n, int[] arr1, int[] arr2) {
        int len = arr1.length;
        String[] bi1 = new String[len];
        String[] bi2 = new String[len];

        // 이진수로 바꾸기
        for (int i = 0; i < len; i++) {
            bi1[i] = Integer.toBinaryString(arr1[i]);
            bi2[i] = Integer.toBinaryString(arr2[i]);
        }

        // 변환하기
        String[] code = new String[len];
        for (int i = 0; i < len; i++) {
            bi1[i] = "0".repeat(n - bi1[i].length()) + bi1[i];
            bi2[i] = "0".repeat(n - bi2[i].length()) + bi2[i];
            String tmp = "";
            for (int j = 0; j < n; j++) {
                if (bi1[i].charAt(j) == '1' || bi2[i].charAt(j) == '1') tmp += "#";
                else tmp += " ";
            }
            code[i] = tmp;  
        } 
        return code;
    }
}