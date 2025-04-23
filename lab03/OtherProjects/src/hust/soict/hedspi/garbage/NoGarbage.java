package hust.soict.hedspi.garbage;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.io.IOException;


public class NoGarbage {
	public static void main(String[] args) throws IOException {
        String filename = "C:\\Users\\Admin\\Documents\\text.exe";
        byte[] inputBytes = Files.readAllBytes(Paths.get(filename));
        long startTime = System.currentTimeMillis();

        StringBuilder outputString = new StringBuilder();
        for (byte b : inputBytes) {
            outputString.append((char) b);
        }

        long endTime = System.currentTimeMillis();
        System.out.println((endTime - startTime));
    }

}
