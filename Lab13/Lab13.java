import java.nio.file.*;
import java.util.Scanner;
import static java.nio.file.StandardOpenOption.*;
import java.io.*;
public class Lab13 {
    public static void main(String[] args) {
        //This was very epic
        Path file = Paths.get("C:\\Users\\upina\\Desktop\\Projects\\Lab13\\directory.txt");
        final String SENTINEL = "ZZZ";
        String pNumbers;
        String entry;
        String w = "";
        Scanner inputDevice = new Scanner(System.in);
        try {
            OutputStream output = new BufferedOutputStream(Files.newOutputStream(file, CREATE));
            BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(output));
        System.out.println("Enter a name: ");
        entry = inputDevice.nextLine();
        while(!entry.equals(SENTINEL))
        {
            System.out.println("Enter the phone number");
            pNumbers = inputDevice.nextLine();
            w = entry + ", " + pNumbers + " \n";
            writer.write(w, 0, w.length());
            System.out.println("Enter a name or " + SENTINEL + " to stop.");
            entry = inputDevice.nextLine();
        }
        writer.close();
    }
    catch(Exception e)
    {
        System.out.println("Message: " + e);
        }
    }
}
