class Solution {
    public int solution(int hp) {
        int answer = 0;
        
        int a=5;
        int b=3;
        int c=1;
        
        answer = hp/a;
        
        int many = hp%a;
        
        if(many > 0){
                if(many >= 3){
            if(many%3 == 0){
                answer++;
            }else{
                answer += 2;
            }
        }else {
            if(many == 1){
                answer ++;
            }else{
                answer += 2;
            }
        }
        }
        
    
      
        
        
        
        return answer;
    }
}