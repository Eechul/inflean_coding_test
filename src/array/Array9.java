
package array;

import java.util.Scanner;

// 9. 격자판 최대합
public class Array9 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[][] grid = new int[n][n];
        for(int i = 0; i<n; i++) {
            for(int j = 0; j<n; j++) {
                grid[i][j] = in.nextInt();
            }
        }
        for(int i = 0; i<n; i++) {

            for(int j = 0;  j<n; j++) {
                

            }
        }

        for(int i = 0; i<n; i++) {
            System.out.printf(String.valueOf(answer[i]));
            System.out.printf(" ");
        }
    }
}
