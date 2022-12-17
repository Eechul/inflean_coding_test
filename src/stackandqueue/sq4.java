package stackandqueue;

import java.util.Scanner;
import java.util.Stack;

// 4. 후위식 연산(posfix)
public class sq4 {

    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        char[] cs = in.next().toCharArray();
        Integer answer = null;
        Stack<Integer> st = new Stack<>();

        for (char c : cs) {
            if(c < 48 || c > 57) {
                st.push(calc(c, st.pop(), st.pop()));
            } else {
                st.push(Character.getNumericValue(c));
            }
        }

        System.out.println(st.pop());
    }

    private static Integer calc(char calcType, Integer a, Integer b) {
        if(calcType == '+') { return b + a; }
        else if(calcType == '-') { return b - a; }
        else if(calcType == '*') { return b * a; }
        else if(calcType == '%') { return b % a; }
        else { return null; }

    }
}
