package string;

import java.util.Scanner;

public class String5 {

    public static void main(String[] args) {
//        a#b!GE*T@S
        Scanner in = new Scanner(System.in);
        String inStr = in.next();
        StringBuilder targetSb = new StringBuilder();
        for (int i = 0; i < inStr.length(); i++) {
            char inC = inStr.charAt(i);
            if((inC >= 65 && inC <= 95) || (inC >= 97 && inC <= 120)) {
                targetSb.append(inStr.charAt(i));
            }
        }
        String target = targetSb.reverse().toString();
        int targetIdx = 0;
        for (int j = 0; j < inStr.length(); j++) {
            char inC = inStr.charAt(j);
            if((inC >= 65 && inC <= 95) || (inC >= 97 && inC <= 120)) {
                 target.charAt(targetIdx);
            }
        }


    }
}
