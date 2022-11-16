package string;

import java.util.Scanner;

// 12. 암호
public class String12 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String answer = "";
        String tword = "";
        int ten = 0;
        int wnum = Integer.parseInt(in.nextLine());
        String str = in.nextLine();
        str += " ";

        for(int i=0; i<str.length(); i++) {
            if(i != 0 && (i % 7 == 0)) {
                ten = Integer.parseInt(tword, 2);
                answer += (char) ten;
                tword = "";
                ten = 0;
            }
            if(str.charAt(i) == '#') { tword += "1"; }
            else { tword += "0"; }

        }

        System.out.println(answer);
    }
}
