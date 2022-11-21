
package array;

import java.util.Scanner;

// 10. 봉우리
public class Array10 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt()+2;
        int answer = 0;
        int[][] grid = new int[n][n];

        for(int i = 1; i<n-1; i++) {
            for(int j = 1; j<n-1; j++) {
                grid[i][j] = in.nextInt();
            }
        }

        for(int i = 1; i<n-1; i++) {
            for(int j = 1; j<n-1; j++) {
                int target = grid[i][j];
                int up = grid[i-1][j];
                int right = grid[i][j+1];
                int bottom = grid[i+1][j];
                int left = grid[i][j-1];

                if(target > up && target> right && target > bottom && target > left) { answer++; }
            }
        }
        System.out.printf(String.valueOf(answer));
    }
}
