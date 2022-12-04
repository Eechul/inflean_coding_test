package twopointerAndSlidingwindow;

import java.util.Scanner;

// 5. 연속된 자연수의 합(수학)
public class ts5_2 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int answer = 0, cnt = 0;

        // init
        n--;
        cnt++;
        while(n>0) {
            cnt++;
            n = n - cnt;
            if(n%cnt == 0) { answer++; }
        }


        System.out.println(answer);
    }
}
