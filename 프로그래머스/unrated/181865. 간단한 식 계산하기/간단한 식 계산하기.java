class Solution {
    public int solution(String binomial) {
        int answer = 0;
        
        String[] cal = binomial.split(" ");

       
        if(cal[1].equals("+")){
            answer = Integer.parseInt(cal[0]) + Integer.parseInt(cal[2]);
        }else if(cal[1].equals("-")){
            answer = Integer.parseInt(cal[0]) - Integer.parseInt(cal[2]);
        }else{
            answer = Integer.parseInt(cal[0]) * Integer.parseInt(cal[2]);
        }
        
 
 
            
        
        return answer;
    }
}