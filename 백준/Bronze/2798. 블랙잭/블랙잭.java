import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main { 
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        int N = Integer.parseInt(st.nextToken()); // 카드의 개수
		int M = Integer.parseInt(st.nextToken()); // 근접할 목표 숫자

        int[] array = new int[N];
 
		st = new StringTokenizer(br.readLine(), " ");
		for (int i = 0; i < N; i++) {
			array[i] = Integer.parseInt(st.nextToken());
		}
		
		int result = game(array, N, M);
		System.out.println(result);

    }

    static int game(int[] array, int N, int M) { // 3번의 for 루프
		
        int result = 0;
 
		for (int i = 0; i < N - 2; i++) {
 
			for (int j = i + 1; j < N - 1; j++) {
 
				for (int k = j + 1; k < N; k++) {
					
					// 3개 합 sum
					int sum = array[i] + array[j] + array[k];
					
					// M과 sum이 같으면 return 하고 종료
					if (M == sum) {	
						return sum;
					}
					
					// sum이 이전 합보다 크면서 M 보다 작을 때 result 갱신 
					if(result < sum && sum < M) {
						result = sum;
					}
				}
			}
		}
		 
		return result;
	}
        
}
