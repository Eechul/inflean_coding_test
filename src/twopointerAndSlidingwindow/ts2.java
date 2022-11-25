package twopointerAndSlidingwindow;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

// 2. 공통원소 구하기
// two pointer 전략의 핵심은 정렬 상태에서의 p1, p2 비교
public class ts2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int p1 = 0, p2 = 0;
        int n = in.nextInt();
        int[] arrN = new int[n];
        for(int i=0; i<n; i++) {
            arrN[i] = in.nextInt();
        }
        int m = in.nextInt();
        int[] arrM = new int[m];
        for(int j=0; j<m; j++) {
            arrM[j] = in.nextInt();
        }

        Arrays.sort(arrN);
        Arrays.sort(arrM);

        ArrayList<Integer> answer = new ArrayList<>();
        while(p1<n && p2<m) {
            if(arrN[p1] == arrM[p2]) {
                answer.add(arrN[p1++]); p2++;
            }
            else if(arrN[p1] < arrM[p2]) { p1++; }
            else { p2++; }
        }

        for(int x : answer) { System.out.printf(x+" "); }
    }
}
