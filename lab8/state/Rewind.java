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

    public boolean pressPlay() {
      System.out.println("The player cannot play while rewinding");

      return false;
    }

    public boolean pressPause() {
      System.out.println("The player cannot be paused while rewinding");

      return false;
    }

    public boolean pressStop() {
      System.out.println("The player is now stopped");
      remote.setState(remote.getStoppedState());
      remote.setPosition(0);

      return true;
    }

    public boolean pressRewind() {
        System.out.println("The player is already rewinding");

        return false;
    }
}
