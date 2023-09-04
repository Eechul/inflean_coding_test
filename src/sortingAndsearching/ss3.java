package sortingAndsearching;

import java.util.Scanner;

// 3. 삽입정렬
public class ss3 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();
        int[] arr = new int[N];

        for (int i=0; i<N; i++) {
            arr[i] = in.nextInt();
        }

        for (int i=1; i<N+1; i++) {
            for (int j=i-1; j>0; j--) {
                if (arr[j-1] > arr[j]) {
                    int tmp = arr[j];
                    arr[j] = arr[j-1];
                    arr[j-1] = tmp;
                }
            }
        }

        for (int i=0; i<N; i++) {
            System.out.print(arr[i]+" ");
        }
    }
}
