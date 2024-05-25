
import java.io.BufferedReader;
import java.io.IOException;
import java.util.Scanner;


class Main {
    public static void main(String[] args) throws IOException {

        Scanner sc = new Scanner(System.in);
        int one = sc.nextInt();
        int two = sc.nextInt();

        int three = (two%10) * one;
        int four = ((two%100) / 10) * one;
        int five = (two/100) * one;

        int six = three + (four*10) + (five*100);

        System.out.println(three);
        System.out.println(four);
        System.out.println(five);
        System.out.println(six);
        

    }
}

