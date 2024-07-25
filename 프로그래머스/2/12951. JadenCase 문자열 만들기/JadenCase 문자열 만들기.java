import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine(); // 문자열 입력받기
        System.out.println(new Solution().solution(s));
    }

    public String solution(String s) {
        // 결과를 저장할 StringBuilder
        StringBuilder result = new StringBuilder();
        
        // 문자열의 각 문자에 대해 처리
        boolean isNewWord = true;
        for (char ch : s.toCharArray()) {
            if (Character.isWhitespace(ch)) {
                // 공백이면 결과에 추가
                result.append(ch);
                isNewWord = true; // 다음 문자가 단어의 시작일 수 있음을 나타냄
            } else {
                if (isNewWord) {
                    // 새 단어의 첫 문자일 때
                    result.append(Character.toUpperCase(ch));
                    isNewWord = false;
                } else {
                    // 단어의 나머지 문자일 때
                    result.append(Character.toLowerCase(ch));
                }
            }
        }
        
        return result.toString();
    }
}
