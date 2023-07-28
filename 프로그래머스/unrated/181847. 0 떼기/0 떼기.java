class Solution {
    public String solution(String n_str) {
        int idx = 0;
        for (String str : n_str.split("")) {
            if (idx == 0 && !str.equals("0")) break;
            if (!str.equals("0")) break;
            idx++;
        }
        if (idx == 0) return n_str;
        return n_str.substring(idx, n_str.length());
    }
}