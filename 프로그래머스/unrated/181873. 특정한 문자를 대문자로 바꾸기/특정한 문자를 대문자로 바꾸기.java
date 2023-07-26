class Solution {
    public String solution(String my_string, String alp) {
        int idx = my_string.indexOf(alp);
        if (idx >= 0) {
            String str = my_string.substring(idx, idx + 1);
            return my_string.replace(str, str.toUpperCase());
        }
        return my_string;
    }
}