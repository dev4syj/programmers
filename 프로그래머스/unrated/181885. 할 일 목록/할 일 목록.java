class Solution {
    public String[] solution(String[] todo_list, boolean[] finished) {
        int size = 0;
        for (int i = 0; i < finished.length; i++) {
           if (!finished[i]) size++;
        }
        String answer[] = new String[size];
        int idx = 0;
        for (int j = 0; j < finished.length; j++) {
            if (!finished[j]) {
                answer[idx] = todo_list[j];
                idx++;
            }
        }
        return answer;
    }
}