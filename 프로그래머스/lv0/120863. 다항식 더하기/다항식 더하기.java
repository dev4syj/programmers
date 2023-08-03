import java.util.*;
class Solution {
    public String solution(String polynomial) {
        String answer = "";
        int cons = 0, x_cnt = 0;
        for (String str : polynomial.split(" ")) {
            if (str.contains("x")) {
                str = str.replace("x", "");
                if (str.equals("")) x_cnt++;
                else x_cnt += Integer.parseInt(str);
            } else if (!str.equals("+") && !str.contains("x")) {
                cons += Integer.parseInt(str);
            }             
        }
        if (cons > 0 && x_cnt > 1) return x_cnt + "x + " + cons;
        else if (cons > 0 && x_cnt == 1) return "x + " + cons;
        else if (cons == 0 && x_cnt > 1) return x_cnt + "x";
        else if (cons == 0 && x_cnt == 1) return "x";
        return String.valueOf(cons);
    }
}