import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.util.Random;

public class GetJokeImpl extends UnicastRemoteObject implements GetJoke {

    private String list[] = {"joke1", "joke2", "joke3", "joke4", "joke5"};

    public GetJokeImpl() throws RemoteException { }

    public String getJoke() throws RemoteException {
        Random rand = new Random();
        int value = rand.nextInt(5);

        return list[value];
    }
}
