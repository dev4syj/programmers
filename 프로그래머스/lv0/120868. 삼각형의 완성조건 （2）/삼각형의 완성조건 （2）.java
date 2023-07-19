class Solution {
    public int solution(int[] sides) {
       
        int i = Math.max(sides[0], sides[1]) - Math.min(sides[0], sides[1]);
        int longest = Math.max(sides[0], sides[1]) - i;
        int rest = sides[0] +  sides[1] - 1 - Math.max(sides[0], sides[1]);
        return longest + rest;
    }
}