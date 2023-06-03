import java.util.*;

public class Searchin2Darray {
    public static void main(String[] args) {
        int[][] num = new int[][] {
                { 1, 2, 3, 4, 5 },
                { 10, 11, 12, 13, 14, 15 },
                { 16, 17, 19, 20 },

        };
        int target = 34;
    }

    public static int[] Searchin2Darray(int[][] arr, int target) {
        for (int row = 0; row < arr.length; row++) {
            for (int col = 0; col < arr[row].length; col++) {
                if (arr[row][col] == target) {
                    return new int[] { row, col };

                }
            }

        }
        return new int[]{ -1, -1 };
    }

}
