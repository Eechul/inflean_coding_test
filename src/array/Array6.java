
package array;

import java.util.Scanner;

// 6. 뒤집은 소수
public class Array6 {

    public static boolean isPrime(int num) {
        if(num == 1) { return false; }
        for(int i = 2; i<num; i++) {
            if(num % i == 0) { return false; }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();
        int[] pn = new int[N];
        StringBuilder answer = new StringBuilder();
        for(int i=0; i<N; i++) {
            pn[i] = Integer.parseInt(new StringBuffer(in.next()).reverse().toString());
            if(isPrime(pn[i])) { answer.append(pn[i]+" ");  }
        }
        System.out.printf(answer.toString());
    }
}
