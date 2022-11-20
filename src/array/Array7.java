
package array;

import java.util.Scanner;

// 7. 점수 계산
public class Array7 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] score = new int[n];
        int con = 0;
        int answer = 0;
        for(int i = 0; i<n; i++) {
            score[i] = in.nextInt();
        }
        for(int i = 0; i<n; i++) {
            if(score[i] == 1) {
                con++;
            } else {
                con = 0;
            }
            answer += con;
        }
        System.out.printf(String.valueOf(answer));
    }
}
