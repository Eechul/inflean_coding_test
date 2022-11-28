package twopointerAndSlidingwindow;

import java.util.Scanner;

// 4. 연속 부분수열
public class ts4 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int m = in.nextInt();
        int answer = 0;
        int[] arr = new int[n];
        int lt = 0;
        int sum = 0;
        for(int i=0; i<n; i++) { arr[i] = in.nextInt(); }

        for(int rt=0; rt<n; rt++) {
            sum += arr[rt];
            if(sum == m) { answer++; }
            while(sum > m) {
                sum -= arr[lt];
                lt++;
                if(sum == m) { answer++; }
            }
        }
        System.out.println(answer);
    }
}
