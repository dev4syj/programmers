class Solution {
    public int solution(int n) {
        // 3진법으로 바꾸기
        String three = Integer.toString(n, 3);
        
        // 앞뒤 반전
        StringBuffer sb = new StringBuffer(three);
        three = sb.reverse().toString(); 
        
        // 앞뒤 반전 후 앞자리 0 없애기
        String before = Integer.parseInt(three,3) + ""; 
        return Integer.parseInt(before, 10); // 10진법으로 바꾸기
    }
}