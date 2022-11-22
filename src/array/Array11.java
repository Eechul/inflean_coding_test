
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

        for(int i = 0; i<grade; i++) {
            for(int j = 0; j<n; j++) {
                for(int k = 0; k<n; k++) {
                    if(j != k && (stu[j][i] == stu[k][i])) {
                        answerArr[j]++;
                    }
                }
            }
        }

        for(int i = 0; i<n; i++) {
            if(answerNum < answerArr[i]) {
                answerStu = (i+1);
            }
            answerNum = answerArr[i];
        }
        System.out.println(answerStu);
    }
}
