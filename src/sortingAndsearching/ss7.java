package sortingAndsearching;

import java.util.*;

// 7. 좌표 정렬
public class ss7 {

    public static class Point implements Comparable<Point> {
        int x, y;

        public Point(int x, int y) {
            this.x = x;
            this.y = y;
        }

        @Override
        public int compareTo(Point o) {
            if (this.x == o.x) { return this.y - o.y; }
            return this.x - o.x;
        }
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int N = in.nextInt();
        Point[] points = new Point[N];
        
        for (int i=0; i<N; i++) { 
            points[i] = new Point(in.nextInt(), in.nextInt());
        }

        Arrays.sort(points);

        for (Point point : points) {
            System.out.println(point.x+" "+point.y);
        }
    }
}
