package twopointerAndSlidingwindow;


import java.util.ArrayList;
import java.util.Scanner;

// 1. 두 배열 합치기
public class ts1 {

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

        ArrayList<Integer> answer = new ArrayList<>();
        while(p1<n && p2<m) {
            if(arrN[p1] < arrM[p2]) { answer.add(arrN[p1++]); }
            else { answer.add(arrM[p2++]); }
        }
        while (p1<n) { answer.add(arrN[p1++]); }
        while (p2<m) { answer.add(arrM[p2++]); }

        for(int x : answer) { System.out.printf(x+" "); }
    }
}
