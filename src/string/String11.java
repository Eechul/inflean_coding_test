package string;

import java.util.Scanner;

// 11. 문자열 압축
public class String11 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String str = in.nextLine();
        str += " ";
        int cnt = 1;
        StringBuilder answer = new StringBuilder();
        for(int i = 0; i < str.length() - 1; i++) {
            if(str.charAt(i) == str.charAt(i+1)) { cnt++; }
            else {
                answer.append(str.charAt(i));
                if(cnt != 1) { answer.append(cnt); }
                cnt = 1;
            }
        }
        System.out.println(answer.toString());
    }
}
