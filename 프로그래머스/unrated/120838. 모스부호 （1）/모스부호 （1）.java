import java.util.*;

class Solution {
    public String solution(String letter) {
        String answer = "";
        
        String [] morse = {".-","-...","-.-.","-..",".","..-.","--.","....","..",".---","-.-",".-..","--","-.","---",".--.","--.-",".-.","...","-","..-","...-",".--","-..-","-.--","--.."};
        
        Map<String, Character> morseMap = new HashMap<>();
        
        for(char i='a'; i<='z'; i++){
            int index = i - 'a'; // a의 ASCII값 빼주면서 morse배열 인덱스 값 만들기
            morseMap.put(morse[index], i); // 각각의 모스부호와 알파벳 순서대로 Map에 넣어주기
        }
        
        String [] letters = letter.split(" "); // letter 공백으로 구분해서 배열에 넣어주기
        
        for(int i=0; i<letters.length; i++){
            // letters배열에 값이 morseMap의 키값과 일치한다면
            if(morseMap.containsKey(letters[i])){
                // answer에 morseMap의 키값의 value값을 넣어준다.
                answer += morseMap.get(letters[i]);
            }
        }
        
        
        
        
        return answer;
    }
}