import java.util.*;
class Solution {
    public String[] solution(String myString) {
        List<String> list = new ArrayList<>();
        for (String str : myString.split("x")) {
            if (!str.equals("")) list.add(str);
        }
        Collections.sort(list);
        return list.toArray(new String[list.size()]);
    }
}