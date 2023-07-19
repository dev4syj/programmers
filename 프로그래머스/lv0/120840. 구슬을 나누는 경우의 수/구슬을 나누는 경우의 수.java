class Solution {
    public int solution(int balls, int share) {
        int minShare = Math.min(share, balls - share);
        long result = 1; // overflow 막기 위해 int 대신 사용
        
        // 경우의 수 -> 조합으로 계산
        for (int i = 1; i <= minShare; i++) {
            // 재귀함수 쓰면 점점 커지다 어느 시점에서 overflow 발생 가능
            // i 늘리면서 바로 계산하기 -> 나눠주면서 크기 조절
            result = result * (balls - i + 1) / i;
        }
        return (int) result;
    }
}