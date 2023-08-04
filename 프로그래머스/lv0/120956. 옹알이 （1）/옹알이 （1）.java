class Solution {
    public int solution(String[] babbling) {
        int answer = 0;
        for (String str : babbling) {
            str = str.replaceFirst("aya", "1").replaceFirst("ye", "2")
                    .replaceFirst("woo", "3").replaceFirst("ma", "4");
            int tmp = 0;
            for (char ch : str.toCharArray()) {
                if (Character.isDigit(ch)) tmp++;
            }
            if (tmp == str.length()) answer++;
        }
        return answer;
    }
}