package hashmapAndTreemap;

import java.util.*;

// 5. K번째 큰 수
public class ht5 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int k = in.nextInt();
        int[] arr = new int[n];
        TreeSet<Integer> treeset = new TreeSet<>(Comparator.reverseOrder());
        int answer = -1;

        for (int i=0; i<n; i++) { arr[i] = in.nextInt(); }

        for(int i=0; i<n-2; i++) {
            for(int j=i+1; j<n-1; j++) {
                for(int p=j+1; p<n; p++) {
                    if(!treeset.contains(arr[i] + arr[j] + arr[p])) {
                        treeset.add(arr[i] + arr[j] + arr[p]);
                    }
                }
            }
        }
        Integer[] tmp = treeset.toArray(new Integer[0]);
        if(tmp.length > k) { answer = treeset.toArray(new Integer[0])[k-1]; }
        System.out.println(answer);
    }
}
