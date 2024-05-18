import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt();

        for (int i = 1; i <= N; i++) {
            int blank = N - i;
            int star = 2 * i - 1;
            printStar(blank, star);
        }

        for (int i = N - 1; i >= 1; i--) {
            int blank = N - i;
            int star = 2 * i - 1;
            printStar(blank, star);
        }

        scanner.close();
    }

    private static void printStar(int blank, int star) {
        for (int i = 0; i < blank; i++) {
            System.out.print(" ");
        }
        for (int i = 0; i < star; i++) {
            System.out.print("*");
        }
        System.out.println();
    }
}