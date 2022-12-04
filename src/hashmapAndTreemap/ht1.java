package hashmapAndTreemap;

import java.util.HashMap;
import java.util.Scanner;

public class ht1 {


    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int max = 0;
        char anwser = ' ';
        int n = in.nextInt();
        String s = in.next();
        HashMap<Character, Integer> map = new HashMap<>();

        for(char x : s.toCharArray()) {
            map.put(x, map.getOrDefault(x, 0) + 1);
        }

        for (char key : map.keySet()) {
            if(max < map.get(key)) {
                max = map.get(key);
                anwser = key;
            }
        }
        System.out.println(anwser);
    }
}
