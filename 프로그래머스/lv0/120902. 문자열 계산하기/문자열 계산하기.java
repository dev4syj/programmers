class Solution {
    public int solution(String my_string) {
        String rp = my_string.replace(" ", "");
        String tmp = "";
        char c_list[] = rp.toCharArray();
        int answer = 0;
        char lastOperator = '+';
        
        for (char c : c_list) {
            if (Character.isDigit(c)) {
                tmp += c;
            } else {
                if (!tmp.isEmpty()) {
                    int num = Integer.parseInt(tmp);
                    if (lastOperator == '+'){
                         answer += num;
                    } else if (lastOperator == '-'){
                         answer -= num;
                    }
                    tmp = "";
                }
                lastOperator = c;
            }    
        }
        if (!tmp.isEmpty()) {
            int num = Integer.parseInt(tmp);
            if (lastOperator == '+') {
                answer += num;
            } else if (lastOperator == '-') {
                answer -= num;
            }
        }
        return answer;
    }
}