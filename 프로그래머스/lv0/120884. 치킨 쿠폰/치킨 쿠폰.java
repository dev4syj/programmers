class Solution {
    public int solution(int chicken) {
        int answer = 0;     
        
        int coupon = chicken;  // 처음 치킨 주문으로 받은 쿠폰
        int service = 0;  // 서비스로 추가 발급받은 쿠폰
        int rest = 0;  // 10개가 안 되서 남은 쿠폰 개수
        
        while (coupon >= 10) { // 서비스로 주문할 수 있는 쿠폰 개수가 있을 때까지만 반복
            answer += coupon / 10; // 서비스로 주문 가능한 치킨 개수
            rest = coupon % 10;  // 서비스 주문 후 남은 쿠폰
            
            coupon /= 10; // 주문 후 새롭게 생긴 쿠폰
            coupon += rest;  // 이전 주문에서 남은 쿠폰 개수
        }
        return answer;
    }
}