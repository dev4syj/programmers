import java.util.*;
class Solution {
    public String solution(String my_string, int s, int e) {
        String tmp = my_string.substring(s, e + 1);
        String front = my_string.substring(0, s);
        String back = my_string.substring(e + 1);
        
        StringBuffer sb = new StringBuffer(tmp);
        String rv = sb.reverse().toString();
        
        return front + rv + back;
    }
}