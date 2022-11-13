package string;

import java.util.Scanner;

public class String1 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String str = in.next();
        char t = in.next().charAt(0);
        int cnt = 0;

        str = str.toLowerCase();
        t = Character.toLowerCase(t);
        for(char x : str.toCharArray()) {
            if(t == x) { cnt++; }
        }

        System.out.println(cnt);
    }
}
