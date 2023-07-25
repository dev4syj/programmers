import java.util.*;
public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        String str = "";
        for (char c : a.toCharArray()) {
            if (Character.isLowerCase(c)) {
                str += String.valueOf(c).toUpperCase();
            } else {
                str += String.valueOf(c).toLowerCase();
            } 
        }
        System.out.println(str);
    }
}