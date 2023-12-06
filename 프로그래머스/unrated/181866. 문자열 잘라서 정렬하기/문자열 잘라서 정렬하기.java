import java.util.*;

class Solution {
    public String[] solution(String myString) {
        
        String[] answer = myString.split("x");
        
        Arrays.sort(answer);
        
        answer = Arrays.stream(answer)
                .filter(s -> !s.isEmpty())
                .toArray(String[]::new);
        
        return answer;
    }
}