class Solution {
    public String solution(String code) {
        String answer = "";
        int idx = 0;
        int mod = 0;
        for (String str : code.split("")) {
            if (str.equals("1")) {
                if (mod == 0) mod = 1;
                else mod = 0;
            } else {
                if (mod != 1) {
                    if (idx % 2 == 0) answer += str;
                } else {
                    if (idx % 2 != 0) answer += str;
                }
            }
            idx++;
        }
        if (answer == "") return "EMPTY";
        return answer;
    }
}