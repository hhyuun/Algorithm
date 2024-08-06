import java.util.ArrayList;
import java.util.List;

public class Solution { 

    public int[] solution(int[] answers) {

        // 1,2,3번 각각의 배열 생성
        int[] array1 = new int[answers.length];
        int[] array2 = new int[answers.length];
        int[] array3 = new int[answers.length];

        for(int i=0; i<answers.length; i++){ 
            array1[i] = (i%5)+1;
        }

        int[] pattern2 = {2, 1, 2, 3, 2, 4, 2, 5};
        for(int i=0; i<answers.length; i++){
            array2[i] = pattern2[i % pattern2.length];
            
        }

        int[] pattern3 = {3, 3, 1, 1, 2, 2, 4, 4, 5, 5};
        for(int i=0; i<answers.length; i++){
            array3[i] = pattern3[i % pattern3.length];
        }
        
        int[] counts = new int[3];

        for(int i=0; i<answers.length; i++){
            if(answers[i] == array1[i]){
                counts[0]++;
            }
        }

        for(int i=0; i<answers.length; i++){
            if(answers[i] == array2[i]){
                counts[1]++;
            }
        }

        for(int i=0; i<answers.length; i++){
            if(answers[i] == array3[i]){
                counts[2]++;
            }
        }

        // 가장 높은 점수 찾기
        int maxScore = Math.max(counts[0], Math.max(counts[1], counts[2]));

        List<Integer> result = new ArrayList<>();
        for (int i = 0; i < counts.length; i++) {
            if (counts[i] == maxScore) {
                result.add(i + 1);
            }
        }

        // int로 반환
        return result.stream().mapToInt(i -> i).toArray();

        



        
    }
    public static void main(String[] args) {
        Solution solution = new Solution();
        
        
    }
}
