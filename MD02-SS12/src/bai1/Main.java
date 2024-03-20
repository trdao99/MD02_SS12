package bai1;

import java.util.PriorityQueue;
import java.util.Queue;

public class Main {
    public static void main(String[] args) {
        Queue<Integer> queue =new PriorityQueue<>();
        for (int i = 0; i < 10; i++) {
            queue.offer((int) (Math.random()*100));
        }
        System.out.println(queue);
    }


}
