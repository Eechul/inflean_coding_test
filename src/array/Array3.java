package array;

import java.util.Scanner;

// 3. 가위 바위 보
public class Array3 {

    public static char rps(int a, int b) {
        if(a == b) { return 'D'; }
        else if(a == 1 && b == 3) { return 'A'; }
        else if(a == 2 && b == 1) { return 'A'; }
        else if(a == 3 && b == 2) { return 'A'; }
        else { return 'B'; }
    }

    public static StringBuilder solution(int N, int[] a, int[] b) {
        StringBuilder answer = new StringBuilder();
        for(int i=0; i<N; i++) {
            answer.append(rps(a[i], b[i]));
            answer.append("\n");
        }
        return answer;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int N = Integer.parseInt(in.nextLine());
        int[] a = new int[N];
        int[] b = new int[N];
        for(int i=0; i<N; i++) {
            a[i] = in.nextInt();
        }
        for(int j=0; j<N; j++) {
            b[j] = in.nextInt();
        }
        System.out.println(solution(N, a, b).toString());
    }
}
