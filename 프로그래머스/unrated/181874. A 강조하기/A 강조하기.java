class Solution {
    public String solution(String myString) {
        String str = myString.replace("a", "A");
        String answer = "";
        for (char s : myString.replace("a", "A").toCharArray()) {
            if (s != 'A' && Character.isUpperCase(s)) answer += String.valueOf(s).toLowerCase();
            else answer += s;
        }
        return answer;
    }
}