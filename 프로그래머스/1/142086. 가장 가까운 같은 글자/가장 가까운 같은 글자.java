

class Solution {
    public int[] solution(String s) {
        int[] answer = new int[s.length()];
        
        // 문자열의 길이만큼 반복
        for(int i=0; i<s.length(); i++){
            
     
            if(i != 0){
                // i가 0이 아니면, 실행
                
                // index변수에 현재 문자열의 직전 문자열까지 추출 후, 현재 문자열의 
                // lastIndex를 조회하고 index 변수에 저장
                // substring으로 추출한 문자열중에 현재 문자열이 없다면 -1반환
                int index = s.substring(0,i).lastIndexOf(s.charAt(i));
                // ex) i == 3 s.substring(0,3 == ban
                // s.charAt(i)는 a이고 ban에서 a의 마지막 인덱스는 1이므로 index에 1 저장
                
                // index가 -1이 아니라면 == 현재 문자열이 이전 문자열중에 있다면
                if(index != -1){
                    // answer 배열에 i-index의 값을 넣어준다
                    answer[i] = i - index;
                }else{
                    // 이전 문자열중에 현재 문자열이 존재하지 않다면 -1을 넣어준다
                    answer[i] = -1;
                }
                
            }else{
               // i가 0이면(첫번째 문자열이면) answer배열에 -1 넣기
                answer[i] = -1;
            }
            
       
            
            
            
        }
        
        return answer;
    }
}