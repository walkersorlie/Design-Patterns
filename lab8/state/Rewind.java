/**
 * Rewind.java
 *
 * This file represents the Rewind state.
 */

public class Rewind implements State {
    private RemoteDevice remote;

    public Rewind(RemoteDevice remote) {
        this.remote = remote;
    }

    public boolean rewindToStopped() {
        System.out.println("Rewound and now stopped");
        remote.setState(remote.getStoppedState());

        return true;
    }
}
