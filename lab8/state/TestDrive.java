
public class TestDrive {
	public static void main(String[] args) {
		
		RemoteDevice remote = new RemoteDevice();
		State state = remote.getPlayingState();

		remote.setState(state);
		remote.pressPlay();

		state = remote.getPausedState();
		remote.setState(state);
		remote.pressPause();

		state = remote.getStoppedState();
		remote.setState(state);
		remote.pressStop();

		remote.pressRewind();

	}

}
