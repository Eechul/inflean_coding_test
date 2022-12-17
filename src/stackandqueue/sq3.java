package stackandqueue;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import java.util.Stack;

// 3. 크레인 인형뽑기
// 강사님은 1개의 스택으로 2중 포문을 돌았다.
// 난 boards의 칼럼마다 Queue를 도입하여 문제를 해결했다.

// 강사님 코드의 장점 및 단점, 장점: 변수가 많지 않아 가독성이 좋다. / 단점: 크레인 작동 코드에서 중첩 포문으로 인해 성능이 떨어질 수 있다.
// 내 코드의 장점 및 단점, 장점: 크레인 작동 코드에서 성능이 좋다. / 단점: boards 칼럼마다 큐가 있기 때문에 변수 할당이 많아 성능이 떨어질 수 있다.
// 단점의 공통점은 xxx 때문에 성능 저하이다.
// 프로그래머스의 문제를 보니, board를 배열로 넘겨준다.. 큐 문제가 아니였나보다.
public class sq3 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        Queue<Integer>[] boards = new LinkedList[n];
        int answer = 0;
        Stack<Integer> moves = new Stack<>();

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                int val = in.nextInt();
                if (boards[j] == null) { boards[j] = new LinkedList<>(); }
                if (val != 0) { boards[j].add(val); }
            }
        }

        int m = in.nextInt();

        for (int i = 0; i < m; i++) {
            int val = in.nextInt();
            Queue<Integer> board = boards[val-1];
            if (board.isEmpty()) { continue; }
            int pick = board.poll();
            if(!moves.isEmpty() && moves.peek() == pick) {
                moves.pop();
                answer += 2;
            } else {
                moves.push(pick);
            }
        }
        System.out.println(answer);
    }
}
