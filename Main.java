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
        int company = s.nextInt();
        int maxDogs = s.nextInt();
        DogWalker[] walkers = new DogWalker[100];
        for (byte i = 0; i < 100; i++) {
            walkers[i] = new DogWalker(maxDogs, companies[s.nextInt()]);
        }

        int startHour = s.nextInt();
        int endHour = s.nextInt();
        int pay[] = new int[100];
        for (byte i = 0; i < 100; i++) {
            pay[i] = walkers[i].dogWalkShift(startHour, endHour);
            startHour = s.nextInt();
            endHour = s.nextInt();

        }

        int sumWalker = 0;

        for (int number : pay) {
            sumWalker += number;
        }
        System.out.println(sumWalker);

    }
}
