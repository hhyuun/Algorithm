import java.util.Scanner;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int divisor = scanner.nextInt();
        int[] divisors = new int[divisor];
        for (int i = 0; i < divisor; i++) {
            divisors[i] = scanner.nextInt();
        }
        
        int n = find(divisors);
        System.out.println(n);
    }

    public static int find(int[] divisors) {
        
        Arrays.sort(divisors);
        int n = divisors[0] * divisors[divisors.length - 1];
        
        return n;
    }
}
