
public class TestDrive {
	public static void main(String[] args) {

		RemoteDevice remote = new RemoteDevice();

		remote.pressPlay();

		remote.lockDevice();

		remote.pressPause();

		remote.unlockDevice();

		remote.pressStop();

		remote.pressRewind();

		remote.pressStop();

		remote.pressPlay();

		remote.pressStop();

	}

}
