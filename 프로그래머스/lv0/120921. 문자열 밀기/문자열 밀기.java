class Solution {
    public int solution(String A, String B) {
        String str = A + A;
        String arr1[] = A.split("");
        String arr2[] = B.split("");
        
        int len = B.length();
        if (A.equals(B)) return 0;
        else if (str.contains(B)) {
            for (int i = 0; i < len; i++) {
                String tmp = str.substring(len - 1 - i, len * 2 - 1 -i);
                if (tmp.equals(B)) return i + 1;                
            } 
            return arr2[0].indexOf(arr1[0]);
        }
        else return - 1;
    }
}