
package array;

import java.util.Scanner;

// 11. 임시반장 정하기
public class Array11 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int grade = 5;
        int n = in.nextInt();
        int[] answerArr = new int[5];
        int answerNum = -1;
        int answerStu = -1;
        int[][] stu = new int[n][grade];

        for(int i=0; i<n; i++) {
            for(int j=0; j<grade; j++) {
                stu[i][j] = in.nextInt();
            }
        }

        for(int i = 0; i<n; i++) {
            for(int j = 0; j<n; j++) {
                for(int k = 0; k<grade; k++) {
                    if(stu[i][k] == stu[j][k]) {
                        answerArr[i]++;
                        break;
                    }
                }
            }
            if(answerNum < answerArr[i]) {
                answerNum = answerArr[i];
                answerStu = i+1;
            }
        }
        System.out.println(answerStu);
    }
}
