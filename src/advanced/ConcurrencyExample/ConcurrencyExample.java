package advanced.ConcurrencyExample;

import javax.sound.midi.Soundbank;

public class ConcurrencyExample {
    public static void main(String[] args) throws InterruptedException {
        System.out.println("Thread starts");

        try {
            Thread.sleep(2000);
            System.out.println("MainThread still running");

            Thread.sleep(3000);

        } catch (InterruptedException e) {
            System.out.println("Stoped");
        }


    }


}
