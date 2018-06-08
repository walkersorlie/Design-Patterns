import java.rmi.Remote;
import java.rmi.RemoteException;

public interface GetJoke extends Remote {

    public String getJoke() throws RemoteException;
}
