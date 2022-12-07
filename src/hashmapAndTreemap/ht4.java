package hashmapAndTreemap;


import java.util.HashMap;
import java.util.Scanner;

public class ht4 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.next();
        String t = in.next();
        int lt=0;
        char[] sarr = new char[s.length()];
        HashMap<Character, Integer> tmap = new HashMap<>();
        HashMap<Character, Integer> answer = new HashMap<>();
        int answerCnt = 0;

        for(int i=0; i<s.length(); i++) { sarr[i] = s.charAt(i); }
        for(int j=0; j<t.length(); j++) { tmap.put(t.charAt(j), tmap.getOrDefault(t.charAt(j), 0) + 1); }

        for(int k = 0; k<t.length(); k++) {
            if(tmap.containsKey(sarr[k]) && tmap.get(sarr[k]) > answer.getOrDefault(sarr[k], 0)) {
                answer.put(sarr[k], answer.getOrDefault(sarr[k], 0) + 1);
            }
        }
        if(answer.size() == t.length()) { answerCnt++; }
        answer.clear();
        lt++;

        for(int rt=t.length(); rt<s.length(); rt++) {
            for(int i=lt; i<rt+1; i++) {
                if(tmap.containsKey(sarr[i]) && tmap.get(sarr[i]) > answer.getOrDefault(sarr[i], 0)) {
                    answer.put(sarr[i], answer.getOrDefault(sarr[i], 0) + 1);
                }
            }
            if(answer.size() == t.length()) { answerCnt++; }
            answer.clear();
            lt++;
        }
        System.out.println(answerCnt);
    }
}
