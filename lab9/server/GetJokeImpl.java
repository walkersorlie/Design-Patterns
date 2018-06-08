import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.util.Random;

public class GetJokeImpl extends UnicastRemoteObject implements GetJoke {

    private String joke1 = "Why was the belt sent to jail?\r\nFor holding up a pair of pants!";
    private String joke2 = "Dad, can you put the cat out? I didn't know it was on fire.";
    private String joke3 = "Why was King Arthur's army too tired to fight?\r\nIt has too many sleepless knights.";
    private String joke4 = "An SEO expert walks into a bar, bars, pub, tavern, public house, Irish pub, drinks, beer, alcohol";
    private String joke5 = "What is the biggest lie in the entire universe?\r\n\"I have read and agree to the Terms and Conditions.\"";

    private String list[] = {joke1, joke2, joke3, joke4, joke5};

    public GetJokeImpl() throws RemoteException { }

    public String getJoke() throws RemoteException {
        Random rand = new Random();
        int value = rand.nextInt(5);

        return list[value];
    }
}
