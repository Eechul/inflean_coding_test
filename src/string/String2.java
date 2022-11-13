package string;

import java.util.Scanner;

public class String2 {

    public static void main(String[] args){
        Scanner in=new Scanner(System.in);
        String str = in.nextLine();
        String[] arr = str.split(" ");
        String answer = "";
        for (String word : arr) {
            if(answer.length() < word.length()) { answer = word; }
        }

        System.out.println(answer);
    }
}
