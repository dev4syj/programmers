class Solution {
    public int solution(String s) {
        int answer = 0;
        String str1 = s.replace(" Z", ""); 
        String[] list = s.split(" ");

        for (int i = 0; i < list.length; i++) {
            if (list[i].equals("-")) {
                answer -= Integer.parseInt(list[i + 1]);
                System.out.println("if" + answer);
            } else if (list[i].equals("Z")) {
                answer -= Integer.parseInt(list[i - 1]);
            } else {
                answer += Integer.parseInt(list[i]);
                System.out.println("else" + answer);
            }
            
        }       
        return answer;
    }
}