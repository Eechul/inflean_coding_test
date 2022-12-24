package stackandqueue;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

// 7. 교육과정 설계
public class sq7 {

    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        char[] n = in.next().toCharArray();
        char[] m = in.next().toCharArray();
        Queue<Character> q = new LinkedList<>();

        for (char c : n) { q.offer(c); }

        for (int i=0; i<m.length; i++) {
            if(q.contains(m[i]) && q.peek() == m[i]) { q.poll(); }
        }
        System.out.println(q.size() == 0 ? "YES" : "NO");
    }
}
