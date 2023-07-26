class Solution {
    public String[] solution(String[] names) {
        int size = names.length / 5;
        int len = names.length;
        
        if (len % 5 != 0) size++;
        String[] answer = new String[size];
        int idx = 0;
        
        for (int i = 0; i < size; i++) {
            answer[i] = names[idx];
            if (len - idx < 5) {
                idx += len - idx;
            } else idx += 5;      
        }
        return answer;
    }
}