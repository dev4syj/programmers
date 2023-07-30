import java.util.*;
class Solution {
    public String[] solution(String myStr) {
        List<String> list = new ArrayList<>();
        myStr = myStr.replaceAll("[a-c]", " ");
        myStr = myStr.trim();
        if (myStr.equals("")) list.add("EMPTY");
        else {
            for (String str : myStr.split(" ")) {
                if (!str.trim().equals("")) list.add(str);
            }
        }      
        return list.toArray(new String[list.size()]);
    }
}