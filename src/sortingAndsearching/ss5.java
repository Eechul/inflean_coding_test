package sortingAndsearching;

import java.util.Scanner;

// 5. 중복 확인
public class ss5 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        char answer = 'U';
        int N = in.nextInt();
        int[] numbers = new int[N];

        for (int i = 0; i < N; i++) {
            numbers[i] = in.nextInt();
        }

        for (int i = 0; i < N - 1; i++) {
             for (int j = i+1; j < N; j++) {
                 if (numbers[i] == numbers[j]) {
                     answer = 'D';
                     break;
                 }
             }
             if (answer == 'D') { break; }

        }
        System.out.println(answer);
    }
}
