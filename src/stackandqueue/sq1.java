package stackandqueue;

import java.util.Scanner;
import java.util.Stack;

public class sq1 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.next();
        Stack<Character> stk = new Stack<>();
        char[] c = s.toCharArray();
        String answer = "YES";

        for (int i = 0; i < c.length; i++) {
            if(c[i] == '(') { stk.push(c[i]); }
            else {
                if(stk.isEmpty()) { answer = "NO"; break; }
                stk.pop();
            }
        }
        if(!stk.isEmpty()) { answer = "NO"; }
        System.out.println(answer);
    }
}
