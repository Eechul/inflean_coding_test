package sortingAndsearching;

import java.util.Scanner;

// 7. 좌표 정렬
public class ss7 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int N = in.nextInt();
        int[][] xys = new int[N][2];
        int[] tmp;

        for (int i=0; i<N; i++) {
            xys[i][0] = in.nextInt();
            xys[i][1] = in.nextInt();
        }

        for (int i=0; i<N-1; i++) {
            for(int j=0; j<N-1; j++) {
                if(xys[j][0] != xys[j+1][0] && xys[j][0] > xys[j+1][0]) {
                    tmp = xys[j];
                    xys[j] = xys[j+1];
                    xys[j+1] = tmp;
                }
                if(xys[j][0] == xys[j+1][0] && xys[j][1] > xys[j+1][1]) {
                    tmp = xys[j];
                    xys[j] = xys[j+1];
                    xys[j+1] = tmp;
                }
            }
        }

        for (int i=0; i<N; i++) {
            System.out.println(xys[i][0]+" "+xys[i][1]);
        }
    }
}
