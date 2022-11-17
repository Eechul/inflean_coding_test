package array;

import java.util.Scanner;

// 1. 큰 수 출력하기
public class Array1 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String answer = "";
        int n = Integer.parseInt(in.nextLine());
        String[] str = in.nextLine().split(" ");

        int tmp = 0;
        for(int i=0; i<n; i++) {
            if(tmp < Integer.parseInt(str[i])) { answer += str[i]+" "; }
            tmp = Integer.parseInt(str[i]);
        }
        System.out.println(answer);
    }
}
