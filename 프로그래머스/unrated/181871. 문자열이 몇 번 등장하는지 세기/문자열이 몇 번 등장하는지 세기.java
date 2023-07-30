class Solution {
    public int solution(String myString, String pat) {
        int answer = 0;
        if (!myString.contains(pat)) return 0;
        else {
            int idx = myString.indexOf(pat);
            int len1 = myString.length();
            int len2 = pat.length();
            for (int i = idx; i <= len1 - len2; i++) {
                if (myString.substring(i, i + len2).equals(pat)) answer++;
            }
        }
        return answer;
    }
}