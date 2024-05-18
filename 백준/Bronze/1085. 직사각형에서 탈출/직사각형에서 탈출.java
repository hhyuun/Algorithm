import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        int x = scanner.nextInt();
        int y = scanner.nextInt();
        int w = scanner.nextInt();
        int h = scanner.nextInt();
        
        int minDistanceX = Math.min(x, w - x);
        int minDistanceY = Math.min(y, h - y);

        int minDistance = Math.min(minDistanceX, minDistanceY);

        System.out.println(minDistance);

        scanner.close();



    }
}