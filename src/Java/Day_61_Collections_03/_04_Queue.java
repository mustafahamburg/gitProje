package Java.Day_61_Collections_03;

import java.util.LinkedList;
import java.util.Queue;

public class _04_Queue {
    public static void main(String[] args) {
        // queue FIFO yapisi icerisinde celisir.stack ise LIFO yapisi icerisinde calisir

        Queue<String>queue=new LinkedList<>();
        queue.add("gulden");
        queue.add("symbat");
        queue.add("selim");
        queue.add("ramazan");
        System.out.println("queue = " + queue);

        String str=queue.remove(); // silecegi degeri bir yeni stringe atadi
        System.out.println("str = " + str);

        System.out.println("queue.offer(\"Ayse\") = " + queue.offer("Ayse"));
        System.out.println("queue = " + queue);

        System.out.println("queue.poll() = " + queue.poll()); // poll() methodu remove() methodu ile
                                                              // ayni islemi yapar yani siler
        System.out.println("queue = " + queue);

        System.out.println("queue.element() = " + queue.element()); // element() eleman alma islemi yapar (fifo)
        System.out.println("queue.peek() = " + queue.peek()); //  peek() element() ile ayni
        String name1= queue.peek();  // siradaki element
        System.out.println("name1 = " + name1);


    }
}
