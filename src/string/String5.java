package string;

import java.util.Scanner;

// 5. 특정 문자 뒤집기
public class String5 {

    public static void main(String[] args) {
//        a#b!GE*T@S
        Scanner in = new Scanner(System.in);
        String answer = "";
        char[] s = in.next().toCharArray();
        int lt = 0;
        int rt = s.length - 1;

        while(lt < rt) {
            if(!Character.isAlphabetic(s[lt])) {
                lt++;
            } else if(!Character.isAlphabetic(s[rt])) {
                rt--;
            } else {
                char tmp = s[lt];
                s[lt] = s[rt];
                s[rt] = tmp;
                lt++;
                rt--;
            }
        }
        answer = String.valueOf(s);
        System.out.println(answer);
    }
}
