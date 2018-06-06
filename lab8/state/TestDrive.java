
public class TestDrive {
	public static void main(String[] args) {

		RemoteDevice remote = new RemoteDevice();
		State state = remote.getStoppedState();
		remote.setState(state);

		remote.pressPlay();

		// remote.lockDevice();

		remote.pressPause();

		remote.unlockDevice();
		System.out.println(remote.)
		remote.pressStop();

		remote.pressRewind();

		remote.pressStop();

		remote.pressPlay();

		remote.pressStop();

	}

}
