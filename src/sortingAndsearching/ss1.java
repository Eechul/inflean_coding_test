package sortingAndsearching;

import java.util.Scanner;

public class ss1 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();
        int[] arr = new int[N];

        for (int i=0; i<N; i++) {
            arr[i] = in.nextInt();
        }

        for (int i=0; i<N; i++) {
            int idx = i;
            for (int j=i+1; j<N; j++) {
                if (arr[j] < arr[idx]) {
                    idx = j;
                }
            }
            int tmp = arr[i];
            arr[i] = arr[idx];
            arr[idx] = tmp;
        }

        for (int i=0; i<N; i++) {
            System.out.print(arr[i]+" ");
        }
    }
}
