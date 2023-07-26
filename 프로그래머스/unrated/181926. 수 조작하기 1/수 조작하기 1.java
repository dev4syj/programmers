class Solution {
    public int solution(int n, String control) {
        for (String str : control.split("")) {
            System.out.println(str);
            if (str.equals("w")) n++;
            if (str.equals("s")) n--;
            if (str.equals("d")) n += 10;
            if (str.equals("a")) n -= 10;
        }
        return n;
    }
}