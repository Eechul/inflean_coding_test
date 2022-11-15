package string;

import java.util.Scanner;

// 6. 중복문자제거
public class String6 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String answer = "";
        String str = in.next();

        for(int i=0; i<str.length(); i++) {
            // 내가 한 것
            if(answer.indexOf(str.charAt(i)) == -1) {
                answer += str.charAt(i);
            }

            // 강사님이 한 것: 주어진 문자열을 가지고 문제를 해결하려 했고, indexOf 라는 메소드가 반환하는 index는 first index 라는걸 이용함
//            if(str.indexOf(str.charAt(i)) == -1) {
//                answer += str.charAt(i);
//            }
        }

        System.out.println(answer);
    }
}
