import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int sum = 0;  
        int mid = 0;  
        
        int[] array = new int[5];
        for (int i = 0; i < 5; i++) {
            array[i] = Integer.parseInt(br.readLine());
            sum += array[i];
        }
        Arrays.sort(array);  // 오름차순 정렬
        int avg = sum / 5;  // 평균
        mid = array[2];
        
        System.out.println(avg);
        System.out.println(mid);
    }
}