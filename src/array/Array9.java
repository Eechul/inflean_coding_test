
package array;

import java.util.Scanner;

// 9. 격자판 최대합
public class Array9 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int answer = 0;
        int[][] grid = new int[n][n];
        int row, column;
        int leftDiagonal = 0, rightDiagonal = 0;

        for(int i = 0; i<n; i++) {
            for(int j = 0; j<n; j++) {
                grid[i][j] = in.nextInt();
            }
        }

        for(int i=0; i<n; i++) {
            row=0;
            column=0;
            leftDiagonal += grid[i][i];
            rightDiagonal += grid[i][n-i-1];
            for(int j=0; j<n; j++) {
                row += grid[i][j];
                column += grid[j][i];
            }
            answer = Math.max(answer, row);
            answer = Math.max(answer, column);
        }
        answer = Math.max(answer, leftDiagonal);
        answer = Math.max(answer, rightDiagonal);
        System.out.printf(String.valueOf(answer));
    }
}
