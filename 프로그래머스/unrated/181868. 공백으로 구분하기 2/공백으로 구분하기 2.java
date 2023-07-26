class Solution {
    public String[] solution(String my_string) {
        String s = "";
        for (String str : my_string.split(" ")) {
            if (!str.equals("")) s += str + " ";
        }
        String[] answer = s.trim().split(" ");
        return answer;
    }
}