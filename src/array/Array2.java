package array;

import java.util.Scanner;

// 2. 보이는 학생
public class Array2 {

    public static int solution(int N, int[] height) {
        int answer = 1; int maxHeight = height[0];
        for(int i=1; i<N; i++) {
            if(height[i] > maxHeight) {
                answer++;
                maxHeight = height[i];
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int N = Integer.parseInt(in.nextLine());
        int[] height = new int[N];
        for(int i=0; i<N; i++) {
            height[i] = in.nextInt();
        }
        System.out.println(solution(N, height));
    }
}
