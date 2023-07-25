class Solution {
    public int solution(int a, int b) {
        
        String str1 = a + "" + b + "";
        String str2 = b + "" + a + "";
        int i1 = Integer.parseInt(str1);
        int i2 = Integer.parseInt(str2);
        if (i1 > i2) return i1; 
        return i2;
    }
}