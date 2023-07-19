class Solution {
    public String[] solution(String my_str, int n) {
        int len = 0;
        if (my_str.length() % n == 0) len = my_str.length() / n;
        else len = my_str.length() / n + 1;
        String[] answer = new String[len];
        
        String[] str_list = my_str.split("");
        int index = 0;
        int divide = n - 1;
        String tmp = "";
        for (int i = 0; i < str_list.length; i++) {
            tmp += str_list[i];         
            if (i == divide || i == str_list.length - 1) {
                answer[index] = tmp;
                index++;
                tmp = "";
                divide += n;
            } 
            System.out.println(n);
        }
        return answer;
    }
}