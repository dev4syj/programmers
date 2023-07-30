class Solution {
    public String solution(String letter) {
        String answer = "";
        String code[] = {".-","-...","-.-.","-..",".","..-.","--.","....","..",".---","-.-",".-..","--","-.","---",".--.","--.-",".-.","...","-","..-","...-",".--","-..-","-.--","--.."};
        for (String s : letter.split(" ")) {
            for (int i = 0; i < code.length; i++) {
                if (s.equals(code[i])) answer += (char)(i + 97);
            }
        }
        return answer;
    }
}