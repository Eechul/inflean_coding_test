
package array;

import java.util.Scanner;

// 4. 피보나치 수열
public class Array4 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int N = Integer.parseInt(in.nextLine());
        int[] arr = new int[N];
        arr[0] = 1; arr[1] = 1;
        StringBuilder result = new StringBuilder();
        result.append(arr[0]+" "+arr[1]);
        for (int i = 2; i < N; i++) {
            arr[i] = arr[i-1] + arr[i-2];
            result.append(" "+arr[i]);

        }
        System.out.printf(result.toString());
    }
}
