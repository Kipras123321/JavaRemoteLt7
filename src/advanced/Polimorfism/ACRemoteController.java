package advanced.Polimorfism;

public class ACRemoteController implements RemoteController {

    @Override
    public void enable(boolean action) {
        System.out.println("Turning aircondition on");


    }
}
