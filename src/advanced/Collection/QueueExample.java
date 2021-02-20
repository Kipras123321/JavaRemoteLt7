package advanced.Collection;

import java.util.PriorityQueue;
import java.util.Queue;

public class QueueExample {
    public static void main(String[] args) {
        Queue<String> pokemons = new PriorityQueue<>();

        pokemons.offer("Charmandar");

        pokemons.offer("Pikachu");

        System.out.println(pokemons.peek());
       pokemons.poll();
        System.out.println(pokemons.peek());


    }
}
