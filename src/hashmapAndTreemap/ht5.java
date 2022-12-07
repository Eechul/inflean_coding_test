package hashmapAndTreemap;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

// 5. K번째 큰 수
public class ht5 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int k = in.nextInt();
        int[] arr = new int[n];
        ArrayList<Integer> list = new ArrayList<>();
        int answer = -1;

        for (int i=0; i<n; i++) { arr[i] = in.nextInt(); }

        for(int i=0; i<n-2; i++) {
            for(int j=i+1; j<n-1; j++) {
                for(int p=j+1; p<n; p++) {
                    System.out.println(i+" / "+j+" / "+p);
                    list.add(arr[i] + arr[j] + arr[p]);
                }
            }
        }
        int size = list.size();
        System.out.println("size = " + size);
        Collections.sort(list, Collections.reverseOrder());
        if(list.get(k-1) != null) { answer = list.get(k-1); }
        System.out.println(""+answer);
    }
}
