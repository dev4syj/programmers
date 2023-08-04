class Solution {
    public String solution(int[] food) {
        String answer = "";
        String food_table = "";
        for (int i = 1; i < food.length; i++) {
            if (food[i] > 1) {
                food_table += String.valueOf(i).repeat(food[i]/2);
            }
        }
        answer = food_table + "0";
        StringBuffer sb = new StringBuffer(food_table);
        answer += sb.reverse().toString();
        return answer;
    }
}