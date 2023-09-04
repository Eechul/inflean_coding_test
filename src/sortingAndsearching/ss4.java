package sortingAndsearching;

import java.util.Scanner;

// 4. Least Recently Used - LRU
public class ss4 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int S = in.nextInt();
        int N = in.nextInt();

        int[] arr = new int[N];
        int[] result = new int[S];

        for (int i=0; i<N; i++) {
            arr[i] = in.nextInt();
        }

        for (int x : arr) {
            int tmp = 0;
            for (int j=0; j<S; j++) {
                if (x == result[j]) {
                    tmp = result[j];
                    for (int k=j; k>0; k--) {
                        result[k] = result[k-1];
                    }
                    result[0] = tmp;
                }
            }
            if (tmp == 0) {
                for (int j =S-1; j>0; j--) {
                    result[j] = result[j-1];
                }
                result[0] = x;
            }
        }

        for (int i=0; i<S; i++) {
            System.out.print(result[i]+ " ");
        }
    }
}
