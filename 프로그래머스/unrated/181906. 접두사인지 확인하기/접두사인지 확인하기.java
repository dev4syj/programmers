class Solution {
    public int solution(String my_string, String is_prefix) {
        if (my_string.length() < is_prefix.length()) {
             return 0;
        } else {
            String i = my_string.substring(0, is_prefix.length());
            if (i.equals(is_prefix)) return 1;
        }
        return 0;
    }
}