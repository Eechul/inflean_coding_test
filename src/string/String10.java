package string;

import java.util.Arrays;
import java.util.Scanner;
import java.util.StringTokenizer;

// 10. 가장 짧은 문자거리
// 문제를 쪼개서 생각하면 원할이 풀 수 있다. 한 루프안에서 해결하려니 잘 안풀리는 것이다!
public class String10 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String[] input = in.nextLine().split(" ");
        String str = input[0];
        char c =  input[1].charAt(0);
        int p = 1000;
        int[] answer = new int[str.length()];
        StringBuilder sb = new StringBuilder();

        // left -> right scan
        for(int i=0; i<str.length(); i++) {
            if(str.charAt(i) == c) { p = 0; answer[i] = p;  }
            else { answer[i] = ++p; }
        }
        // 초기화
        p = 1000;
        // right -> left scan
        for(int j=str.length() - 1; j >= 0; j--) {
            if(str.charAt(j) == c) { p = 0; answer[j] = p;  }
            else {
                p++;
//              내가 한 것
//                if(answer[j] > p) { answer[j] = p; }
//              강사님이 한것 -> 직관적이다.
                answer[j] = Math.min(answer[j], p);
            }
            sb.append(answer[j]);
            sb.append(" ");
        }
        // print
        System.out.println(sb.reverse().toString().trim());
    }
}
