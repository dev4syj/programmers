class Solution {
    public String solution(String phone_number) {
        int len = phone_number.length();
        phone_number = phone_number.substring(len - 4, len);
        String answer = "*".repeat(len - 4);
        answer = answer.concat(phone_number);
        return answer;
    }
}