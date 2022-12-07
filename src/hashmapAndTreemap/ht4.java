package hashmapAndTreemap;


import java.util.HashMap;
import java.util.Scanner;

// 4. 모든 아나그램 찾기
// 간과한 것: map의 equals 함수를 쓸 생각을 못했다. equals로 smap과 tmap을 비교하여 정답을 체크할 수 있다.
public class ht4 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.next();
        String t = in.next();
        int lt=0;
        char[] sarr = new char[s.length()];
        HashMap<Character, Integer> smap = new HashMap<>();
        HashMap<Character, Integer> tmap = new HashMap<>();
        int answer = 0;

        for(int i=0; i<s.length(); i++) { sarr[i] = s.charAt(i); }
        for(int j=0; j<t.length(); j++) { tmap.put(t.charAt(j), tmap.getOrDefault(t.charAt(j), 0) + 1); }
        for(int k=0; k<t.length(); k++) {
            if(tmap.containsKey(sarr[k])) {
                smap.put(sarr[k], smap.getOrDefault(sarr[k], 0) + 1);
            }
        }
        if(smap.equals(tmap)) { answer++; }
        smap.clear();
        lt++;

        for(int rt=t.length(); rt<s.length(); rt++) {
            for(int i=lt; i<rt+1; i++) {
                if(tmap.containsKey(sarr[i])) { smap.put(sarr[i], smap.getOrDefault(sarr[i], 0) + 1); }
            }
            if(smap.equals(tmap)) { answer++; }
            smap.clear();
            lt++;
        }
        System.out.println(answer);
    }
}
