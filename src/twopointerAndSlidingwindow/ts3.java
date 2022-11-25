package twopointerAndSlidingwindow;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

// 3. 최대 매출
public class ts3 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int k = in.nextInt();
        int[] arr = new int[n];
        int answer = 0;
        int sum = 0;

        for(int i=0; i<n; i++) { arr[i] = in.nextInt(); }
        for(int j=0; j<k; j++) { answer += arr[j]; }

        sum = answer;
        for(int i=k; i<n; i++) {
            sum += arr[i] - arr[i-k];
            answer = Math.max(sum, answer);
        }
        System.out.println(answer);
    }
}
