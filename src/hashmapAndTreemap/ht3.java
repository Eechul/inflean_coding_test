package hashmapAndTreemap;


import java.util.HashMap;
import java.util.Scanner;

public class ht3 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int k = in.nextInt();
        int p = n % k;
        int[] arr = new int[n];
        HashMap<Integer, Integer> map = new HashMap<>();
        int lt = 0, rt = 1;

        for(int i=0; i<arr.length; i++) {
            arr[i] = in.nextInt();
        }

        while(rt < n) {
            if(rt - lt == k-1) { lt++;  }
            map.put(arr[rt], map.getOrDefault(arr[rt], 0) + 1);
            rt++;
        }


    }
}
