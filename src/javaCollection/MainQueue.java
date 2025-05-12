package javaCollection;

import modelCollection.Pessoa;

import java.util.PriorityQueue;
import java.util.Queue;

public class MainQueue {

    public static void main(String[] args) {
        Queue<Pessoa> queue = new PriorityQueue<Pessoa>();
        queue.add(new Pessoa(3, "TreinaWeb 03"));
        queue.add(new Pessoa(1, "TreinaWeb 01"));
        queue.add(new Pessoa(2, "TreinaWeb 02"));
        System.out.println(queue);

        while (!queue.isEmpty()) {
            Pessoa p = queue.poll();
            System.out.println(p);
        }

        Queue<Pessoa> queue2 = new PriorityQueue<Pessoa>((p1, p2) -> {
            return p1.getNome().compareTo(p2.getNome());
        });
        queue2.add(new Pessoa(3, "TreinaWeb 03"));
        queue2.add(new Pessoa(1, "STreinaWeb 01"));
        queue2.add(new Pessoa(2, "ATreinaWeb 02"));
        System.out.println(queue2);
    }
}
