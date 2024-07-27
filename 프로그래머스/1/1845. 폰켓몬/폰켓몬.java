import java.util.HashSet;

public class Solution {
    public int solution(int[] nums) {
        // 중복 제거를 위한 HashSet
        HashSet<Integer> uniqueTypes = new HashSet<>();
        
        for (int num : nums) {
            uniqueTypes.add(num);
        }
        
        // 중복을 제거한 개수
        int maxTypes = uniqueTypes.size();
        
        // 선택 개수
        int maxSelection = nums.length / 2;
        
        // 최대 선택 가능한 폰켓몬 수는 중복을 제거한 개수 or 선택 개수 중 하나
        return Math.min(maxTypes, maxSelection);
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
    }
    
}
