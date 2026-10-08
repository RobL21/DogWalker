import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Companies {
    public static String selectedC(int a) throws FileNotFoundException{
        String company = "";
        File f = new File("companies.txt");
        Scanner s = new Scanner(f);
        for (byte i = 0; i < a; i++) {
             company = s.nextLine();
        }
       return company;
    }
}