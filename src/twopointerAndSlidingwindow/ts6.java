package twopointerAndSlidingwindow;

import java.util.Scanner;

// 6. 최대 길이 연속 부분수열
public class ts6 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int n = in.nextInt();
        int k = in.nextInt();
        int[] arr = new int[n];
        int answer = 0, lt = 0, rt = 0, cnt = 0;
        for (int i=0; i<n; i++) {
            arr[i] = in.nextInt();
        }

        while(rt < n) {
            if(arr[rt] == 0) { cnt++; }
            while(cnt > k) {
                if(arr[lt] == 0) { cnt--; }
                lt++;
            }
            if(answer < rt - lt + 1) { answer = rt - lt + 1; }
            rt++;
        }
        System.out.println(answer);
    }
}
