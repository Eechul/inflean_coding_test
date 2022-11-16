package string;

import java.util.Scanner;

// 8. 유효한 팰린드롬
public class String8 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String answer = "NO";
        String str = in.nextLine();
        str = str.toLowerCase().replaceAll("[^a-z]", "");

        if(str.equals(new StringBuffer(str).reverse().toString())) { answer = "YES"; }

        System.out.println(answer);
    }

}
