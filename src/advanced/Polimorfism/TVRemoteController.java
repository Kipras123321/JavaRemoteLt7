package advanced.Polimorfism;

public class TVRemoteController implements RemoteController{
    @Override
    public void enable(boolean action) {
        if (action) {
            System.out.println("Turning TV on");

        }
        else {
            System.out.println("Turning TV off");
        }

    }
}
