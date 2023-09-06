package sortingAndsearching;

import java.util.Arrays;
import java.util.Scanner;

// 6. 장난 꾸러기
public class ss6 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int N = in.nextInt();
        int[] heights = new int[N];
        int[] sortedHeights = new int[N];

        for (int i = 0; i < N; i++) {
            heights[i] = in.nextInt();
        }

        sortedHeights = heights.clone();
        Arrays.sort(sortedHeights);

        for (int i = 0; i < N; i++) {
            if (heights[i] != sortedHeights[i]) {
                System.out.print(i+1+" ");
            }
        }
    }
}
