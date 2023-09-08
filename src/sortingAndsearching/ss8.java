package sortingAndsearching;

import java.util.Arrays;
import java.util.Scanner;

// 8. 이분 검색(이진 탐색)
public class ss8 {


    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int N = in.nextInt();
        int M = in.nextInt();
        int lt = 0, rt = N -1;
        int midx = (lt + rt) / 2;
        int[] arr = new int[N];

        for (int i=0; i<N; i++) {
            arr[i] = in.nextInt();
        }

        // 이진 탐색은 꼭 정렬이 되어있어야 한다는 조건이 있다.
        Arrays.sort(arr);

        while(arr[midx] != M) {
            if (arr[midx] > M) {
                rt = midx - 1;
            } else {
                lt = midx + 1;
            }
            midx = (lt + rt) / 2;
        }
        System.out.println(midx+1);
    }
}
