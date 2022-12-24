package stackandqueue;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

// 7. 교육과정 설계
public class sq7 {

    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        String answer = "YES";
        char[] need = in.next().toCharArray();
        char[] plan = in.next().toCharArray();
        Queue<Character> q = new LinkedList<>();

        for (char x : need) { q.offer(x); }
        for (char x : plan) {
            if(q.contains(x)) {
                if(x != q.poll()) { answer = "NO"; break; }
            }
        }
        if(!q.isEmpty()) {answer = "NO"; }
        System.out.println(answer);
    }
}
