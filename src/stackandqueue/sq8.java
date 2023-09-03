package stackandqueue;

import java.util.*;

// 8. 응급실
public class sq8 {

    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int answer = 0;
        int N = in.nextInt();
        int M = in.nextInt();
        Queue<Person> queue = new LinkedList<>();
        for (int i=0; i<N; i++) {
            Person person = new Person(i, in.nextInt());
            queue.offer(person);
        }
        Person tmpPerson = null;
        while (tmpPerson == null || tmpPerson.id != M) {
            tmpPerson = queue.poll();
            for (Person p : queue) {
                if (p.danger > tmpPerson.danger) {
                    queue.offer(tmpPerson);
                    tmpPerson = null;
                    break;
                }
            }
            if (tmpPerson != null) {
                answer++;
            }
        }
        System.out.println(answer);
    }

    public static class Person {
        public int id;
        public int danger;

        public Person(int id, int danger) {
            this.id = id;
            this.danger = danger;
        }
    }
}
