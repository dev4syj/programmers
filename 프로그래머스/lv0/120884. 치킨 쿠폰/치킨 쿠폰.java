class Solution {
    public int solution(int chicken) {
        int answer = 0;     
        
        int coupon = chicken;
        int service = 0, rest = 0;
        
        while (coupon >= 10) {
            answer += coupon / 10;
            rest = coupon % 10;
            
            coupon /= 10;
            coupon += rest;    
        }
        return answer;
    }
}