import java.util.*;
class Solution {
    public int solution(String before, String after) {
        String[] str_list1 = before.split("");
        String[] str_list2 = after.split("");
        String str1_tmp = "", str2_tmp = "";
        
        Arrays.sort(str_list1);
        Arrays.sort(str_list2);
        
        for (String str1 : str_list1) {
            str1_tmp += str1;
        }
        for (String str2 : str_list2) {
            str2_tmp += str2;
        }
        if (str1_tmp.equals(str2_tmp)) return 1;
        else return 0;  
    }
}