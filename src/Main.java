import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Subject subject = new Subject();
        Observer hexObserver = new HexObserver();
        Observer binObserver = new BinObserver();
        Observer octObserver = new OctObserver();
        subject.add(hexObserver);
        subject.add(binObserver);
        subject.add(octObserver);
        Scanner scan = new Scanner(System.in);
        for (int i = 0; i < 5; i++) {
            System.out.print("\nEnter a number: ");

            subject.execute(scan.nextLine());
        }

    }
}
