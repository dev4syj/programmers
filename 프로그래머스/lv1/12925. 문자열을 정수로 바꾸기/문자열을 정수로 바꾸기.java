class Solution {
    public int solution(String s) {
        if (s.contains("-")) {
            s = s.replace("-", "");
            return - Integer.parseInt(s);
        } else {
            s = s.replace("+", "");
            return Integer.parseInt(s);
        }
    }
}