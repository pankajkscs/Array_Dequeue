package DequeDemo;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Iterator;

//forword iterator
public class DequeMain1 {
    public static void main(String[] args) {
        Deque<String> dq = new ArrayDeque<>();
        dq.add("AAA");
        dq.add("BBB");
        dq.add("CCCC");
        dq.add("DDD");
        dq.add("EEE");
        dq.add("BBB");
        dq.add("BBB");
        dq.add("FFF");
        System.out.println(dq);

        Iterator<String> it = dq.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
            
        }
    }
}
