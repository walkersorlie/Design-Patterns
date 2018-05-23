import java.io.*;

public class Part2
{
    public static void main(String[] args) throws IOException {
        InputStream stream;
        String path = "C:\\Users\\TexasRanger\\Dropbox\\Design-Patterns\\lab3\\src\\file.txt";

        path = path.replace("\\", "/");

        try {
            stream = new FlameInputStream(new BufferedInputStream(new FileInputStream(path)));
        } catch (FileNotFoundException e) {
            stream = new FlameInputStream(new BufferedInputStream(new FileInputStream("file.txt")));
        }
        int c;

        while ( (c = stream.read()) >= 0)
            System.out.print((char)c);
    }
}
