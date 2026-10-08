import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Walkers {
   public static String selectedW(int a) throws FileNotFoundException{
        String Walker = "";
        File f = new File("walkers.txt");
        Scanner s = new Scanner(f);
        for (byte i = 0; i < a; i++) {
             Walker = s.nextLine();
        }
       return Walker;
    }
}