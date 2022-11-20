
package array;

import java.util.Scanner;

// 7. 점수 계산
public class Array8 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] score = new int[n];
        int[] answer = new int[n];
        for(int i = 0; i<n; i++) {
            score[i] = in.nextInt();
        }
        for(int i = 0; i<n; i++) {
            int rank = 1;
            for(int j = 0; j<n; j++) {
                if(score[i] < score[j]) { rank++; }
            }
            answer[i] = rank;
        }

        for(int i = 0; i<n; i++) {
            System.out.printf(String.valueOf(answer[i]));
            System.out.printf(" ");
        }
    }
}
