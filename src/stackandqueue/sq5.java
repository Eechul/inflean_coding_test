package stackandqueue;

import java.util.Scanner;
import java.util.Stack;

// 5. 쇠막대기
public class sq5 {

    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        char[] cs = in.next().toCharArray();
        Stack<Character> sk = new Stack<>();
        int answer = 0;

        for (int i=0; i<cs.length; i++) {
            if(cs[i] == ')') {
                sk.pop();
                if(cs[i-1] == '(') { answer += sk.size(); }
                else { answer += 1; }
            } else {
                sk.push(cs[i]);
            }
        }
        System.out.println(answer);
    }
}
