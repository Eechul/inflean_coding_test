package twopointerAndSlidingwindow;

import java.util.Scanner;

// 5. 연속된 자연수의 합
public class ts5_1 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int m =  n / 2 + 1;
        int[] arr = new int[n];
        int answer = 0;
        int lt = 0, sum = 0;

        for(int i=0; i<n; i++) {
            arr[i] = i+1;
        }

        for(int rt=0; rt<m; rt++) {
            sum += arr[rt];
            if(sum == n) { answer++; }
            while(sum >= n) {
                sum -= arr[lt++];
                if(sum == n) { answer++; }
            }
        }
        System.out.println(answer);
    }
}
