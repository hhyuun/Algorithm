import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int arr[] = new int[n];

        for(int i=0; i<n; i++){
            int a = sc.nextInt();
            int b = sc.nextInt();
            arr[i] = a+b;
        }

        sc.close(); 

        for(int j=0;j<n;j++){
            
            System.out.println(arr[j]);
        }
        
        
    }
}
