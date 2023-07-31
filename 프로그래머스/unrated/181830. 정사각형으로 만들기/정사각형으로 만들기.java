import java.util.*;
class Solution {
    public int[][] solution(int[][] arr) {
        List <int[]> list = new ArrayList<>();
        int column = arr.length;
        int row = arr[0].length;
        int zero = 0;
        if (column == row) return arr;
        else if (column > row) {
            zero = column - row;
            for (int[] x : arr) {
                int[] tmp = Arrays.copyOf(x, x.length + zero);
                
                for (int i = x.length; i < tmp.length; i++) tmp[i] = 0;
                list.add(tmp);
            }
        } else {
            zero = row - column;
            for (int[] x : arr) list.add(x);
            
            int[] tmp = new int[row];
            for (int i = 0; i < row; i++) tmp[i] = 0;
            for (int j = 0; j < zero; j++) list.add(tmp);
        }
        return list.toArray(new int[0][]);
    }
}