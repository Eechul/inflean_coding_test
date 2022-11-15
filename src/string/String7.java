package string;

import java.util.Scanner;

// 7. 회문 문자열
public class String7 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String answer = "NO";
        String str = in.next();
        str = str.toLowerCase();

        if(str.equals(new StringBuffer(str).reverse().toString())) { answer = "YES"; }

        System.out.println(answer);
    }
}
