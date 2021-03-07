package advanced.ConcurrencyExample3;

import advanced.ConcurrencyExample2.StopWatch;

public class ConcurrencyEx3    {


    public static void main(String[] args) {

        System.out.println("Main Thread starts");
        StopWatch stopWatch1 = new StopWatch("SW1");
        StopWatch stopWatch2 = new StopWatch("SW2");


        stopWatch1.start();

        try {
            Thread.sleep(2000);
            stopWatch2.start();
            System.out.println("Main Thread still running");

            Thread.sleep(3000);
            System.out.println("Ends");

        } catch (InterruptedException e) {
            System.out.println("Interrupted");
        }
    }
}
