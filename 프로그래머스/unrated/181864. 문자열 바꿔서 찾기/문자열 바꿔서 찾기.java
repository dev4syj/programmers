class Solution {
    public int solution(String myString, String pat) {
        String tmp = "";
        for (String s : myString.split("")) {
            if (s.equals("A")) tmp += "B";
            else tmp += "A";
        }
        if (tmp.contains(pat)) return 1;
        return 0;
    }
}