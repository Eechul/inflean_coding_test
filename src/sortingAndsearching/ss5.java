package sortingAndsearching;

import java.util.Arrays;
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
        
        // 내가 푼 알고리즘
//        for (int i = 0; i < N-1; i++) {
//             for (int j = i+1; j < N; j++) {
//                 if (numbers[i] == numbers[j]) {
//                     answer = 'D';
//                     break;
//                 }
//             }
//             if (answer == 'D') { break; }
//
//        }

        // 정렬을 통한 알고리즘
        Arrays.sort(numbers);
        for (int i = 0; i < N-1; i++) {
            if (numbers[i] == numbers[i+1]) {
                answer = 'D';
                break;
            }
        }

        System.out.println(answer);
    }
}
