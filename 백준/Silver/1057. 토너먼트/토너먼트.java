import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt();
        int kim = scanner.nextInt();
        int lim = scanner.nextInt();

        int game = 0;

        while (kim != lim) {
            kim = (kim + 1) / 2;
            lim = (lim + 1) / 2;
            game++;
        }

        System.out.println(game);
        scanner.close();
    }
}