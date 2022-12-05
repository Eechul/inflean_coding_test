package hashmapAndTreemap;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class ht3 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int k = in.nextInt();
        int[] arr = new int[n];
        ArrayList<Integer> answers = new ArrayList<>();
        HashMap<Integer, Integer> map = new HashMap<>();
        int lt = 0;

        for(int i=0; i<arr.length; i++) {
            arr[i] = in.nextInt();
        }

        for(int j=0; j<k-1; j++) {
            map.put(arr[j], map.getOrDefault(arr[j], 0) + 1);
        }

        for(int rt=k-1; rt<n; rt++) {
            map.put(arr[rt], map.getOrDefault(arr[rt], 0) + 1);
            answers.add(map.size());
            map.put(arr[lt], map.get(arr[lt]) - 1);
            if(map.get(arr[lt]) == 0) { map.remove(arr[lt]); }
            lt++;
        }
        
        for(Integer a : answers) {
            System.out.printf(a+" ");
        }
    }
}
