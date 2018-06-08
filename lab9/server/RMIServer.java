import java.rmi.*;
import java.rmi.server.UnicastRemoteObject;

public class RMIServer
{
 	public static void main(String[] args)  {
        try {
            GetJoke joke = new GetJokeImpl();

            // Bind this object instance to the name "GetJoke"
            Naming.rebind("GetJoke", joke);

            System.out.println("Joke sent");
        }
        catch (Exception e) {
            System.err.println(e);
        }
    }
}
