
package array;

import java.util.Scanner;

// 5. 소수(에라토스테네스 체)
public class Array5 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int N = Integer.parseInt(in.nextLine());
        int[] ch = new int[N+1];
        int answer = 0;
        for(int i=2; i<=N; i++) {
            if(ch[i] == 0) {
                answer++;
                for(int j=i; j<=N; j=j+i) {
                    ch[j] = 1;
                }
            }
        }
        System.out.printf(String.valueOf(answer));
    }
}
