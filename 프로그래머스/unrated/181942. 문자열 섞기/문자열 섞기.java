class Solution {
    public String solution(String str1, String str2) {
        String answer = "";
        String[] list1 = str1.split("");
        String[] list2 = str2.split("");
        for (int i = 0; i < list1.length; i++) {
            answer += list1[i];
            answer += list2[i];
        }
        return answer;
    }
}