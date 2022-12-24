package stackandqueue;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

// 6. 공주 구하기
// 간과한 점: poll한 값을 큐에 offer 할 생각을 못했다는 점
public class sq6 {

    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int k = in.nextInt();
        Queue<Integer> q = new LinkedList<>();

        for (int i=1; i<=n; i++) { q.offer(i); }

//        내 풀이법
        int cnt = 0;
        while(q.size() != 1) {
            cnt++;
            int peek = q.poll();
            if(cnt != k) {
                q.offer(peek);
            } else {
                cnt = 0;
            }
        }
        System.out.println(q.poll());

//        강사님 풀이법
//        int answer = 0;
//        while(!q.isEmpty()) {
//            for(int i=1; i<k; i++) { q.offer(q.poll()); }
//            q.poll();
//            if(q.size() == 1) { answer = q.poll(); }
//        }
//        System.out.println(answer);
    }
}
