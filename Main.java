import java.util.Scanner;
import java.io.File;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        File f = new File("companies.txt");
        Scanner s = new Scanner(f);
        DogWalkCompany[] companies = new DogWalkCompany[100];
        for (byte i = 0; i < 100; i++) {
            companies[i] = new DogWalkCompany(s.nextLine());
        }

        f = new File("walkers.txt");
        s = new Scanner(f);
        DogWalker[] walkers = new DogWalker[100];
        int[] pay = new int[100];

        for (int i = 0; i < 100; i++) {
            int company = s.nextInt();
            int maxDogs = s.nextInt();
            int startHour = s.nextInt();
            int endHour = s.nextInt();

            walkers[i] = new DogWalker(maxDogs, companies[company]);
            pay[i] = walkers[i].dogWalkShift(startHour, endHour);
        }

        int sumWalker = 0;

        for (int number : pay) {
            sumWalker += number;
        }
        System.out.println(sumWalker);

    }
}
