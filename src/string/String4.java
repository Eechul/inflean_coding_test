package string;

import java.util.Scanner;

public class String4 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num = in.nextInt();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < num; i++) {
            String word = in.next();
            word = new StringBuffer(word).reverse().toString();
            sb.append(word);
            sb.append("\n");
        }

        System.out.println(sb.toString());
    }
}
