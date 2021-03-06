package advanced.ConcurrencyExample2;

import java.util.SortedMap;

public class ConcurrencyExample2 extends Thread {
    public static void main(String[] args) {

        System.out.println("Main Thread starts");
        StopWatch stopWatch = new StopWatch();
        stopWatch.start();

        try {
            Thread.sleep(2000);
            System.out.println("Main Thread still running");

            Thread.sleep(3000);
            System.out.println("Ends");

        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }


    @Override
    public void run () {

    }
}

