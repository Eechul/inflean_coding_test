
package array;

import java.util.Scanner;

// 12. 멘토링
public class Array12 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int m = in.nextInt();
        int[][] arr = new int[m][n];
        int pi = -1;
        int pj = -1;
        int cnt = 0;
        int answer = 0;

        for(int i=0; i<m; i++) {
            for(int j=0; j<n; j++) {
                arr[i][j] = in.nextInt();
            }
        }

        for(int i=0; i<n; i++) {
            for(int j=0; j<n; j++) {
                if(i == j) { continue; }
                for(int t=0; t<m; t++) {
                    for(int r=0; r<n; r++) {
                        if(arr[t][r] == (i+1)) {
                            pi = (r+1);
                        }
                        if(arr[t][r] == (j+1)) {
                            pj = (r+1);
                        }
                    }
                    if(pi < pj) {
                        cnt++;
                    }
                }
                if(cnt == m) { answer++; }
                pi = -1;
                pj = -1;
                cnt = 0;
            }
        }
        System.out.println(answer);
    }
}
