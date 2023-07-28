class Solution {
    public int solution(String binomial) {
        String tmp[] = binomial.split(" ");
        int x = Integer.parseInt(tmp[0]);
        int y = Integer.parseInt(tmp[2]);
        if (tmp[1].equals("+")) return x + y;
        else if (tmp[1].equals("-")) return x - y;
        return x * y;
    }
}