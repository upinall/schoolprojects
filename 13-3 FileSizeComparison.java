import java.nio.file.*;
import java.nio.file.attribute.*;
import java.io.IOException;
public class FileSizeComparison {
    public static void main(String[] args) {
        Path textFile = Paths.get("/root/sandbox/lyric1.txt");
        Path wordFile = Paths.get("/root/sandbox/lyric2.txt");
        // Write your code here
        long size1 = textFile.toFile().length();
        long size2 = wordFile.toFile().length();
        System.out.println("lyric1.txt size: " + size1 + " kb, lyric2.txt size: " + size2 + " kb, ratio of sizes: " + (size1 * 100.0/size2));
    }
}
