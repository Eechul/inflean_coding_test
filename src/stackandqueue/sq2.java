package stackandqueue;

import java.util.Scanner;
import java.util.Stack;

public class sq2 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.next();
        Stack<Character> stk = new Stack<>();
        char[] c = s.toCharArray();
        StringBuilder answer = new StringBuilder();

        for (int i = 0; i < c.length; i++) {
            if (c[i] == ')') {
                while(stk.pop() != '(') {}
            } else {
                stk.push(c[i]);
            }
        }
        for (int i=0; i<stk.size(); i++) { answer.append(stk.get(i));}
        System.out.printf(answer.toString());
    }
}
