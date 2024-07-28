import java.io.IOException;
import java.util.ArrayList;

public class Solution {
    public int[] solution(int[] arr) {

        ArrayList<Integer> uniqueList = new ArrayList<>();
        uniqueList.add(arr[0]); 

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] != arr[i - 1]) { // 중복되지 않으면 List에 추가
                uniqueList.add(arr[i]);
            }
        }

        // ArrayList를 array로 변환
        int[] result = new int[uniqueList.size()];
        for (int i = 0; i < uniqueList.size(); i++) {
            result[i] = uniqueList.get(i);
        }

        return result;
    }

    
    public static void main(String[] args) throws IOException {
        Solution solution= new Solution();
    }
    
}
