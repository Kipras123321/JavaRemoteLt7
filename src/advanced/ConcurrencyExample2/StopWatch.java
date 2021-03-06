package advanced.ConcurrencyExample2;

public class StopWatch extends Thread{

    public StopWatch(String sw2) {
    }

    public StopWatch() {

    }

    @Override
    public void run () {
        for (int i = 0; i < 10; i++){
            System.out.println("Stop watch");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
