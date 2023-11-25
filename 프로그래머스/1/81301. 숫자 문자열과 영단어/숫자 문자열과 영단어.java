import java.util.*;

class Solution {
    public int solution(String s) {
            int answer = 0;
                   
            
            // 숫자 문자열 배열 생성
            String [] numbers = {"zero", "one", "two", "three", "four", "five", "six" , "seven", "eight", "nine"};

            
            for(int i=0; i<numbers.length; i++){
                // s에 숫자 문자열의 원소가 포함되어있으면
                if(s.contains(numbers[i])){
                   // replace함수로 문자열을 숫자 문자열로 대체한다
                   s = s.replace(numbers[i], Integer.toString(i));
                }

            }
            // 정수로 된 문자열을 정수형으로 형변환
            answer = Integer.parseInt(s);            

            return answer;
    }
}