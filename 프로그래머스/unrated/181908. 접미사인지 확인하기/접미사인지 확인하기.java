class Solution {
    public int solution(String my_string, String is_suffix) {
        if (my_string.contains(is_suffix)) {
            String str = my_string.substring(my_string.length() - is_suffix.length(),
                                             my_string.length());
            if (is_suffix.equals(str)) return 1;
        } 
        return 0;
    }
}