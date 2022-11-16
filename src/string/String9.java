package string;

import java.util.Scanner;

// 9. 숫자만 추출
public class String9 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int answer = 0;
        String str = in.nextLine();
        str = str.replaceAll("[^0-9]", "");

        answer = Integer.parseInt(str);

        System.out.println(answer);
    }

}
