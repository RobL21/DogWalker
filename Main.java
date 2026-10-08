import java.util.Scanner;
import java.io.FileNotFoundException;

public class Main {
    public static void main(String[] args) throws FileNotFoundException{
        Scanner s = new Scanner(System.in);
        System.out.println("testnum");
        int a = s.nextInt();
        System.out.println(Companies.selectedC(a));
        System.out.println(Walkers.selectedW(a));
    }
}