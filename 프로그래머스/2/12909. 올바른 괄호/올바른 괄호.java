import java.util.Stack;

public class Solution {
    boolean solution(String s){
        
        boolean answer = true;

        // 스택 선언
        Stack<Character> stackStr = new Stack<>();

        // 문자열 한바퀴 돌면서 "("면 스택에 넣고 ")"면 스택에 들어있는 왼쪽괄호를 뺀다
        for(int i=0; i<s.length(); i++){
            if(s.charAt(i) == '(')
                stackStr.push('(');
            else{
                if (stackStr.isEmpty()) {
                    // 스택이 비어있는데 ')'가 나오는 경우
                    answer =  false;
                    break;
                }
                stackStr.pop();
            }
                
        }
        
        // 스택에 괄호가 남아있는 경우
        if (!stackStr.isEmpty()) {
            answer = false;
        }

        return answer;

        
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
    }
}
