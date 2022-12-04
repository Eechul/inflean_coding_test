package hashmapAndTreemap;


import java.util.HashMap;
import java.util.Scanner;

public class ht2 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String a = in.next();
        String b = in.next();
        String answer = "YES";

        HashMap<Character, Integer> map = new HashMap<>();

        for(char x : a.toCharArray()) {
            map.put(x, map.getOrDefault(x, 0) + 1);
        }
        for(char x : b.toCharArray()) {
            if(!map.containsKey(x) || map.get(x) == 0) { answer = "NO"; break; }
            map.put(x, map.get(x) - 1);
        }
        System.out.printf(answer);
    }
}
