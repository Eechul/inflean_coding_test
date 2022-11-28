package twopointerAndSlidingwindow;

import java.util.Scanner;

// 4. 연속 부분수열
public class ts5_2 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();

        int[] arr = new int[n];
        int answer = 0;

        for(int i=0; i<n; i++) {
            arr[i] = i+1;
        }

        System.out.println(answer);
    }
}
