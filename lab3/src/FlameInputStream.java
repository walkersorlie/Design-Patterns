import java.io.*;

public class FlameInputStream extends FilterInputStream
{
    public FlameInputStream(InputStream stream) {

        super(stream);
    }

    public int read() throws IOException {
        int c = super.read();


        return Character.toUpperCase(c);
    }
}

