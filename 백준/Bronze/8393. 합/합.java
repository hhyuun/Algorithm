import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        long n = sc.nextLong();   // n (1 ≤ n ≤ 10,000)
        long sum = 0;

        for(int i=0; i<=n; i++){
            sum += i;

        }
        System.out.println(sum);
    }
}