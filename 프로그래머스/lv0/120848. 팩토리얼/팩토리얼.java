class Solution {
    public int solution(int n) {
        int answer = 0;
        for (int i = 1; i <= 10; i++) {
            if (fac(i) > n) {
                answer = i - 1;
                break;
            } else if (fac(i) == n) {
                answer = i;
                break;
            }   
        }
        return answer;
    }
    
    public static int fac(int num) {
		if (num < 0) {
			throw new IllegalArgumentException("음수는 팩토리얼을 계산할 수 없습니다.");
		} else if (num == 0 || num == 1) {
			return 1;
		} else {
			return num * fac(num - 1);
		}
	}
}