class Solution {
    public boolean solution(String s) {
        if (s.length() == 4 || s.length() == 6) {
            for (char ch : s.toCharArray()) {
                if (!Character.isDigit(ch)) return false;
            }
        } else return false;
        return true;
    }
}